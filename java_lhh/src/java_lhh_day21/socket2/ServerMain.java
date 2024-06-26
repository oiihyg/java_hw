package java_lhh_day21.socket2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerMain {
	
	public static void main(String[] args) {
		int port = 5001;
		String fileName ="src/java_lhh_day21/socket2/server.txt";
		try {
			// 1. serversocket 객체 생성
			ServerSocket serverSocket = new ServerSocket(port);
			// 2. 무한루프
			while(true) {
				// 3. 소켓 승인
				Socket socket = serverSocket.accept();
				// 4. 소켓을 이용하여 objectinputstream 객체 생성
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				// 5. 소켓을 통해 문자열을 읽어옴
				String type = ois.readUTF();
				// 6. 읽어온 문자열이 save이면 save메소드를 실행
				switch (type) {
				case "save":
					save(fileName, ois);
					break;
				}
			}
		} catch (IOException e) {
			
		}
		
	}

	public static void save(String fileName, ObjectInputStream ois) {
		// ois를 통해 연락처 리스트를 가져옴
		List<Contact> list =  null;
		try {
			list = (List<Contact>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		// 파일을 열어서 위에서 가져온 연락처 리스트를 저장
		try(FileOutputStream fos =  new FileOutputStream(fileName);
		         ObjectOutputStream foos = new ObjectOutputStream(fos)){
			foos.writeObject(list);
			foos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
