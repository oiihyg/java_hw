package java_lhh_day15;

import java.util.ArrayList;

public class ListEx01 {

	public static void main(String[] args) {

		// 리스트 기본 사용 예제
		ArrayList<String> list = new ArrayList<String>();
		
		/*
		 * add(객체) : 객체를 리스트 뒤에 추가. 컬렉션 인터페이스에서 구현
		 * add(번지, 객체) : 번지 위치에 객체를 추가. 리스트 인터페이스에서 구현
		 */
		list.add("안녕하세요");
		list.add("good");
		list.add(0,"하이");
		System.out.println(list);
		System.out.println("------------------");
		/*
		 * remove(객체) : 리스트에서 주어진 객체와 일치하는 객체를 제거. 컬렉션 인터페이스에서 구현
		 * remove(번지) : 리스트에서 번지 위치에 있는 객체를 삭제하고 삭제된 객체를 반환. 리스트 인터페이스
		 */
		
		System.out.println(list.remove("안")); // 일치하는 객체가 없어서 삭제 실패
		System.out.println(list.remove("하이")); // 일치하는 객체가 있어서 삭제 성공
		System.out.println(list);
		System.out.println(list.remove(0)); // 삭제하고 삭제된 객체 반환
		System.out.println(list); // 삭제가 완료되면 자동으로 앞으로 땡긴다.
		list.add("gaadaaw");
		System.out.println(list);
		System.out.println("------------------");
		/*
		 * get(번지) : 번지 위치에 있는 객체를 가져옴. 리스트 인터페이스
		 */
		System.out.println(list.get(1));
		System.out.println("------------------");
		
		/*
		 * clear() : 리스트를 비움. 컬렉션 인터페이스
		 */
		// list.clear(); // 뒤에 명령어 설명을 위해 주석처리
		System.out.println(list);
		System.out.println("------------------");
		
		
		/*
		 * contains(객체) : 리스트에 객체가 있는지 없는지 알려줌. 컬렉션 
		 */
		System.out.println(list.contains("good"));
		System.out.println(list.contains("goo"));
		System.out.println(list);
		System.out.println("------------------");
		
		/*
		 * indexOf(객체) : 리스트에 객체가 몇번지에 있는지 알려줌. 리스트
		 */
		System.out.println(list.indexOf("good"));
		System.out.println(list.indexOf("gaadaaw"));
		System.out.println(list);
		System.out.println("------------------");
		
		
		
		
		
		
		
		
	}

}
