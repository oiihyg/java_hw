package day24;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 * 파일을 이어 쓰려면 뒤에 true를 추가해주면 된다
		 */
		try (FileWriter fw = new FileWriter("src/day24/ex17.txt")){
			fw.write(97);
			fw.write(65);
			fw.flush();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
