package java_lhh_day17;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamEx02 {

	public static void main(String[] args) {

		String fileName = "src/java_lhh_day17/charStream.txt";
		
		try(FileWriter fw = new FileWriter(fileName)){
			String str = "aabbccddeeaa  ddgg aafaalkjlq;f \n d gd zzz";
			for(int i=0;i<str.length();i++) {
				fw.write(str.charAt(i));
			}
			fw.write(str);
		} catch (IOException e) {
			System.out.println("파일 입출력 예외가 발생했습니다.");
		}
		
	}

}
