package java_lhh_day15;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		/*
		 * put(key, value) : key와 value를 추가, 이미 key가 등록되어 있으면 새 value를 저장하고
		 * 기존 value를 반환
		 */
		map.put("admin", "admin123");
		System.out.println(map.put("admin", "admin123"));
		
		System.out.println(map);
		
		// remove(key) : 주어진 key와 일치하는 키가 있으면 삭제하고 value를 반환
		map.remove("admin");
		System.out.println(map);
		
		
		map.put("abc123", "def123");
		map.put("asdasd", "def123");
		
		System.out.println(map);
	}

}
