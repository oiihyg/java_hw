package java_lhh_day05;

public class StarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  *을 하나씩 출력해서 다음과 같이 출력 되도록 중첩 반복문을 이용하여 작성하세요
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  반복횟수 : i 는 1부터 5까지 1씩 증가 
		 *  규칙성 : 출력
		 *		=> 반복횟수 j는 1부터 i까지 1씩 증가
		 *		   규칙성 : *을 출력
		 *		   반복문 종료 후 : 엔터를 출력
		 *	반복문 종료 후 : 없음
		 */
		int i,j;
		
		char chr = '*';
		for(i=1;i<6;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(chr);
			}
			System.out.println();
		}
		
		
		
		
	}

}
