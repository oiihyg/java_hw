package java_lhh_day14;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import java_lhh_program.Program;

public class PhoneManager implements Program{

	private Contact [] list;
	private int count;
	private Scanner scan = new Scanner(System.in);
	private final int Insert = 1;
	private final int Update = 2;
	private final int Delete = 3;
	private final int Search = 4;
	private final int Exit = 5;
	
	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 연락처 추가");
		System.out.println("2. 연락처 수정");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) throws Exception {
		switch(menu) {
		case Insert:
			insert();
			expand(); // 리스트가 부족하면 늘리는 작업
			break;
		case Update:
			update();
			break;
		case Delete:
			delete();
			break;
		case Search:
			search();
			break;
		case Exit:
			System.out.println("플그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	private void expand() {
		// 연락처 리스트가 다 찼는지 확인해서 안찼으면 종료
		if(list.length > count) {
			return;
		}
		// 찼으면 10개를 추가
		Contact[] tmp = new Contact[list.length + 10];
		System.arraycopy(list, 0, tmp, 0, list.length);
		list = tmp;
		
	}

	private void search() {
		// 이름을 입력
		scan.nextLine();
		System.out.println("검색할 이름을 작성하세요(전체 검색 : 엔터) :");
		String name = scan.nextLine();
		// 이름에 맞는 연락처를 출력
		printContact(name);
	}

	private void delete() {
		// 이름 입력
		System.out.print("이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		// 이름과 일치하는 연락처들을 출력하고 없으면 종료
		if(!printContact(name)) {
			return;
		}
		// 번호를 선택
		int index = scan.nextInt()-1;
		// 번호가 유효한지 확인해서 유효하지 않으면 안내문구 출력 후 종료
		if(!checkContact(name, index)) {
			System.out.println("잘못 선택했습니다.");
			return;
		}
		// 번호를 삭제
		// 해당 번지에서 앞으로 한칸씩 당겨줘야 함
		count--;
		// 번지가 마지막 번지가 아니면 
		if(index != count) {
			// 중간 삭제 하는 경우
			Contact [] tmp = new Contact[list.length];
			System.arraycopy(tmp, index+1, list, index, count-index);
		}
		// 연락처 개수를 1 감소
		list[count]=null;
		System.out.println("연락처를 삭제했습니다.");
		return;
	}

	private void update() throws Exception {
		// 이름 입력
		scan.nextLine(); // 공백처리
		System.out.print("이름 : ");
		String name = scan.nextLine();
		// 연락처 리스트에서 이름과 일치하는 연락처를 번지+1과 함께 출력
		if(!printContact(name)) {
			return;
		}
		// 번호 선택
		System.out.print("번호 선택 : ");
		int index = scan.nextInt()-1;
		// 번호가 올바르지 않으면 잘못선택했습니다. 하고 종료
		boolean res = checkContact(name, index);
		if(!res) {
			System.out.println("잘못 선택했습니다.");
			return;
		}
		// 올바르면 이름, 번호를 입력받음
		scan.nextLine();
		System.out.print("이름 : ");
		String newName = scan.nextLine();
		System.out.print("번호 : ");
		String newNumber = scan.nextLine();
		// 이름, 번호를 이용하여 객체를 생성
		Contact contact = new Contact(newName, newNumber);			
		// 생성된 객체가 중복된 번호이면 안내문구 출력하고 아니면 객체를 추가.
		if(indexOf(index,contact) >= 0) {
			System.out.println("이미 등록된 번호입니다.");
			return;
		}
		list[index]=contact;
	}

	private boolean checkContact(String name, int index) {
		if(list == null || count == 0) {
			return false;
		}
		if(index < 0 || index >= count) {
			return false;
		}
		return list[index].getName().contains(name);
	}

	private boolean printContact(String name) {
		if(list == null || count == 0) {
			System.out.println("등록된 연락처가 없습니다.");
			return false;
		}
		int sameCount = 0; // 이름과 일치하는 연락처 개수 => 없는 경우 안내문구를 위해
		for(int i=0;i<count;i++) {
			if(list[i].getName().contains(name)) {
				System.out.println(i+1+list[i].toString());
				sameCount++;
			}
		}
		if(sameCount == 0) {
			System.out.println("일치하는 연락처가 없습니다.");
			return false;
		}
		return true;
	}

	private void insert() throws Exception {
		// 정보(이름, 번호)를 입력하고
		scan.nextLine(); // 엔터 처리용
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("번호 : ");
		String number = scan.nextLine();
		// 입력한 정보를 이용하여 객체를 생성
		Contact contact = new Contact(name, number);
		// 연락처 리스트에 입력한 번호 객체가 있는지 없는지 확인해서
		int index = indexOf(contact);
		// 있으면 이미 등록된 번호입니다. 라고 출력
		if(index >= 0) {
			System.out.println("이미 등록된 번호입니다.");
			return;
		}
		// 없으면 등록이 완료되었습니다. 라고 출력
		list[count] = contact;
		count ++; // 멤버변수로 유지되서 저장됨 따로 리턴 값을 안줘도됨 
		System.out.println("등록이 완료되었습니다.");
		// System.out.println(Arrays.toString(list)); // 리스트 확인용
		return;
	}

	private int indexOf(Contact contact) {
		return indexOf(-1,contact);
	}
	
	private int indexOf(int index, Contact contact) {
		if(list==null || count == 0) {
			return -1;
		}
		for(int i=0;i<count;i++) {
			if(i==index) {
				continue;
			}
			if(list[i].equals(contact)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void run() {
		String fileName = null;
		// 불러오기
		load(fileName);
		int menu = Exit + 1;
		do {
			// 메뉴 출력
			printMenu();
			// 메뉴 선택
			try {
				menu = scan.nextInt();
				// 선택한 메뉴에 따른 기능 실행
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("메뉴를 잘못 입력 했습니다.");
				// 입력 버퍼에 있는 내용을 비움
				scan.next();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(Arrays.toString(list));
		}while(menu != Exit);
		
		// 저장하기
		// save(fileName);
	}
	
	@Override
	public void load(String fileName) {
		if(fileName==null) {
			System.out.println("불러올 파일이 없습니다.");
		}
			list = new Contact[10];
			return;
		}
		// 추후 파일 입력출력을 배우면 불러오는 기능을 구현
	
	
	
	
}
