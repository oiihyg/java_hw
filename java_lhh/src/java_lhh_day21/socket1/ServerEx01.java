package java_lhh_day21.socket1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerEx01 {

   public static void main(String[] args) {
      int port = 5001;
      String fileName = "src/java_lhh_day21/socket1/server.txt";
      
      try {
         ServerSocket serverSocket = new ServerSocket(port);
         while (true) {
            Socket socket = serverSocket.accept();
            
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            
            String type = ois.readUTF();
            
            switch(type) {
               case "save" :
                  receive(ois, fileName);
               break;
               case "load" :
                  send(oos, fileName);
               break;
            }
            
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static void send(ObjectOutputStream oos, String fileName) {
      List<String> list = null;
      try(FileInputStream fis =  new FileInputStream(fileName);
         ObjectInputStream fois = new ObjectInputStream(fis)){
         list = (List<String>)fois.readObject();
         oos.writeObject(list);
         oos.flush();
      } catch (Exception e) {
         try {
            oos.writeObject(new ArrayList<String>());
            oos.flush();   
         } catch (IOException e1){
            e1.printStackTrace();
         }
      } 
   }

   @SuppressWarnings("unchecked")
   private static void receive(ObjectInputStream ois, String fileName) {
      List<String> list = null;
      try {
         list = (List<String>)ois.readObject();
      } catch (Exception e) {
         return;
      }
      try(FileOutputStream fos =  new FileOutputStream(fileName);
         ObjectOutputStream foos = new ObjectOutputStream(fos)){
         foos.writeObject(list);
      } catch (Exception e) {
         e.printStackTrace();
      } 
      System.out.println("서버에 저장");
   }

}
