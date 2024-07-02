package day24;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Ex02 {

	public void fileSave(String fileName) {
		Scanner sc = new Scanner(System.in);
		String address = sc.next();
		Food f = new Food("사과", 20);
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("kh/model/vo/"+address+"txt"))){
			oos.writeObject(f);
		}catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
	public void cliet() {
		int port = 3000;
		String serverIP;
		
	}
		
}

class Food implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private static int kcal;
	
	public Food() {}
	public Food(String name, int kcal) {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
}


//int num1 = 1, num2 = 2;

//double res = num1 / (double)num2;

/*
 * 원인 : 정수 나누기 정수 => 정수이기 때문에 0을 실수로 저장해봐야 0.0이 됨
 * 해결 방법 : num1이나 num2를 실수로 자료 형변환을 해야 함
 */

//System.out.println(num1 + " / " + num2 + " = " + res);