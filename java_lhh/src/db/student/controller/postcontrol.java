//package db.community.controller;

import java.util.Scanner;

//import db.community.service.PostService;
//import db.community.service.PostServiceImp;

public class PostController {

	private Scanner scan;
	//private PostService postService = new PostServiceImp();
	
	public PostController(Scanner scan) {
		this.scan = scan;
	}

	public void insertCommunity() {
		//커뮤니티명을 입력
		System.out.print("커뮤니티명 : ");
		String community = scan.next();
		
		//서비스에게 커뮤니티명을 주면서 등록하라고 시킨 후 성공하면 성공했다고 알림
		if(postService.insertCommunity(community)) {
			System.out.println("커뮤니티 등록 성공!");
		}
		//실패하면 실패했다고 알림
		else {
			System.out.println("커뮤니티 등록 실패!");
		}
		
	}
	
	public void updateCommunity(String name) {
		// 이전 커뮤니티명과 이후 커뮤니티명중에 null이 있으면 false를 리턴
		
		// 이전 커뮤니티명과 이후 커뮤니티명이 같으면 false를 리턴
		
		// 등록된 커뮤니티명이어야 수정할 수 있다
		// 이전 커뮤니티명을 이용해서 커뮤티니vo를 가져옴
		
		// 커뮤니티vo가 null이면 false를 리턴
		
		// 바꾸려는 커뮤니티명이 이미 등록되어있으면 수정할 수 없다
		// 이후 커뮤니티명을 이용해서 커뮤니티vo를 가져옴
		
		// 이후 커뮤니티vo가 null이 아니면 false를 리턴
		
		// 이전 커뮤니티vo의 커뮤니티명을 이후 커뮤니티명으로 수정
		
		// 다오에게 이전 커뮤티니vo를 주면서 커뮤니티명을 수정하라고 요청하고 처리 여부를 반환
		
		return false;		
		
	}
	
	public boolean deleteConnunity(String name) {
		//다오에게 커뮤니티명을 주면서 삭제하라고 요청 후 삭제 여부를 반환
		
		return false;
	}
	
	
}











































