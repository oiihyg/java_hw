package day24;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex16 {

	public static void main(String[] args) {
		Person p = new Person("사과", 20);
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/day24/text16.txt"))){
			oos.writeObject(p);
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 4.src/dat/ex16.txt에 저장된 객체를 불러온 후 콘솔창에 출력하는 코드를 작성 
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream("src/day24/text16.txt"))){
			// (Person)을 생략하면 에러발생
			// 원인 : readObject는 리턴이 Object인데, 다운캐스팅은 자동으로 이루어지지 않는다
			// 		그래서 명시적으로 클래스 형변환을 해야 한다.
			Person p2 = (Person)ois.readObject();
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

@Data
@AllArgsConstructor
class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
}

/*
 * 1. 이름과 나이를 저장하고 관리하는 클래스를 생성하세요
 * 2. 이름이 홍길동, 나이는 21인 객체를 생성하세요
 * 3. src/day24/text16.txt에 2번에서 작성한 객체를 저장하세요
 * 	- ObjectStream을 활용
 */