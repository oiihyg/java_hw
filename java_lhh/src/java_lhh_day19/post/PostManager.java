package java_lhh_day19.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java_lhh_program.Program;

public class PostManager implements Program{

	private Scanner scan = new Scanner(System.in);
	private List<Post> list = new ArrayList<Post>();
	
	private final int Insert = 1;
	private final int Update = 2;
	private final int Delete = 3;
	private final int Search = 4;
	private final int Exit = 5;
	
	private String fileName = "src/java_lhh_day19/post/data.txt";
	
	@Override
	public void printMenu() {
		System.out.print("메뉴\n"
				+ "1. 게시글 등록\n"
				+ "2. 게시글 수정\n"
				+ "3. 게시글 삭제\n"
				+ "4. 게시글 조회\n"
				+ "5. 프로그램 종료\n"
				+ "메뉴 선택 : ");
	}

	@Override
	public void run() {
		int menu;
		load(fileName);
		do {
			// 메뉴 출력
			printMenu();
			// 메뉴 선택
			menu = scan.nextInt();
			// 선택한 메뉴 실행
			try {
				runMenu(menu);
			} catch (Exception e) {
				System.out.println("예외가 발생했습니다.");
				e.printStackTrace();
			}
			
		}while(menu != Exit);
		
		save(fileName);
	}

	@Override
	public void save(String fileName) {
		
	}
	@Override
	public void load(String fileName) {
		
	}
	
	@Override
	public void runMenu(int menu) throws Exception {
		switch (menu) {
		case Insert:
			insert();
			break;
		case Update:
			update();
			Post post = selectPost();
			break;
		case Delete:
			delete();
			break;
		case Search:
			search();
			break;
		case Exit:
			exit();
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			break;
		}
	}

	private void exit() {
		printBar();
		System.out.println("프로그램을 종료합니다.");
		printBar();
	}

	private void search() {
		// 검색어 입력
		
		// 게시글에서 검색어가 제목 또는 내용에 들어간 게시글리스트를 가져옴
		
		// 게시글 리스트가 비어 있으면 안내문구 출력 후 종료
		
		// 가져온 게시글 리스트를 출력
		
		// 게시글을 확인할건지 선택
		
		// 확인하지 않겠다고 하면 종료
		
		// 확인하면 게시글 번호를 입력
		
		// 입력받은 게시글 번호로 객체를 생성하고
		
		// 검색 리스트에서 생성된 객체와 일치하는 번지를 확인
		
		// 번지가 유효하지 않으면 안내문구 출력 후 종료
		
		// 번지에 있는 게시글을 가져옴
		
		// 가져온 게시글을 출력 
		
		// 메뉴로 돌아가려면... 문구 출력
		
		// 엔터를 입력받도록 처리
	}

	private void delete() {
		// 삭제할 게시글 번호를 입력
		
		// 게시글 번호에 맞는 게시글을 가져옴
		
		// 게시글이 없으면 종료
		
		// 리스트에서 게시글을 삭제
	}

	private void update() {
		// 수정할 게시글 번호를 입력
		printBar();
		System.out.println("수정할 게시글 번호");
		int num = scan.nextInt();
		printBar();
		// 입력한 게시글 번호를 이용하여 게시글 객체를 생성
		Post post = new Post(num);
		// 리스트에서 생성한 객체가 몇번지에 있는지 번지를 가져옴
		int index = list.indexOf(post);
		// 일치하는 객체가 없으면(가져온 번지가 0보다 작으면) 알림 문구 출력 후 종료
		if(index < 0) {
			printBar();
			System.out.println("등록되지 않거나 삭제된 게시글 입니다");
			return;
		}
		// 있으면 아이디, 비번을 입력 받음
		System.out.println("아이디 : ");
		String id = scan.next();
		System.out.println("비번 : ");
		String pw = scan.next();
		
		// 가져온 객체의 아이디와 비번이 입력 받은 아이디와 비번과 같은지 확인해서,
		// 같지 않으면 안내문구 출력 후 종료
		post = list.get(index);
		if(!post.checkWriter(id, pw)) {
			printBar();
			System.out.println("아이디 또는 비번이 잘못 됐습니다.");
			return;
		}
		// 같으면 새 제목과 내용을 입력
		scan.nextLine();
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String contents = scan.nextLine();
		// 가져온 객체의 제목과 내용을 입력받은 제목과 내용으로 수정
		post.update(title, contents);
		// 안내문구 출력
		printBar();
		System.out.println(post.getNum()+"번 게시글이 수정되었습니다.");
	}

	private Post selectPost() {
		System.out.println("수정할 게시글 번호 : ");
		int num = scan.nextInt();
		return null;
	}

	private void insert() {
		// 게시글 정보를 입력
		// 입력한 정보를 이용해서 게시글 객체를 생성
		Post post = inputPost();
		// 생성한 게시글 객체를 리스트에 추가
		list.add(post);
		// 알림 문구를 출력
		printBar();
		System.out.println(post.getNum()+"번 게시글이 추가되었습니다.");
	}

	public void printBar() {
		System.out.println("----------------------------");
	}
	
	private Post inputPost() {
		scan.nextLine();
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비번 : ");
		String pw = scan.next();
		return new Post(title, contents, id, pw);
	}
	
}
