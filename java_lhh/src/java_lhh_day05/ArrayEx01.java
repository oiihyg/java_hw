package java_lhh_day05;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 5명의 학생 성적을 저장하기 위한 변수를 선언해보세요.
		// 지역변수는 자동으로 초기화가 안된다.
		int score1,score2,score3,score4,score5;
		
		// 5명의 학생 성적을 저장할 수 있는 배열을 생성
		// 배열은 자동으로 자료형에 맞는 초기화가 된다.
		// 배열은 참조형.(주소를 저장함으로 참조형) 
		int [] scores1 = new int[5];
		int scores2 [] = new int[5];
		// 5개짜리 배열을 만들어서 1,2,3,4,5 순서대로 초기화
		int scores3 [] = new int[] {1,2,3,4,5}; // 뒤에 초기값을 지정하기 
		/*
		scores1[0]=1;
		scores1[1]=2;
		scores1[2]=3;
		scores1[3]=4;
		scores1[4]=5;
		*/
		
		/*
		 * i는 0부터 5보다 작을때까지 1씩 증가
		 */
		for(int i=0;i<5;i++) {
			scores1[i]=i+1;
			System.out.println(scores1[i]);
		}
		
		
		/*
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		System.out.println(scores1[3]);
		System.out.println(scores1[4]);
		*/
		
		
	}

}
