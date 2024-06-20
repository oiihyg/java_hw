package java_lhh_day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java_lhh_program.Program;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactManager implements Program {
	
	private List<Contact> list = new ArrayList<Contact>();
	private Scanner scan = new Scanner(System.in);
	@Override
	public void printMenu() {
		switch (1) {
		case 1:
			
			break;

		default:
			break;
		}
	}

	@Override
	public void runMenu(int menu) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		String fileName = "src/java_lhh_day17/contact/contact.txt";
		
		List<Contact> list = Arrays.asList(
				new Contact("111","aaa"),
				new Contact("222","bbb"),
				new Contact("333","ccc"),
				new Contact("444","ddd"),
				new Contact("555","eee"));
		
		load(fileName);
		
		// 프로그램 실행
		
		//save(fileName);
	}
	
	@Override
	public void save(String fileName) {
		
		// try(FileOutputStream )
		
	}
	
	@Override
	public void load(String fileName) {
		// 파일에 있는 연락처 리스트를 가져와서 list에 저장하는 코드를 작성
	}

}
