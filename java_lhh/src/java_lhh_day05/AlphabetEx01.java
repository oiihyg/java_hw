package java_lhh_day05;

public class AlphabetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * a		i=0 a ~ a => 'a'+0
		 * ab		i=1 a ~ b => 'a'+1
		 * abcd		i=2 a ~ c => 'a'+2
		 * ...
		 * a~z까지
		 * 반복횟수 : i는 0부터 26보다 작을 때까지 1씩 증가
		 * 규칙성 : a부터 a+i 까지 알파벳을 출력
		 * 		=>	반복회수 : j는 0부터 i까지 1씩 증가
		 * 			규칙성 : a + j를 출력
		 * 			반복문 종료 후 : 엔터 출력
		 * 반복문 종료 후 :
		 */
		int i,j;
		
		for(i=0;i<26;i++) {
			for(j=0;j<=i;j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}
		
		/*
		 * 반복횟수 : ch1은 'a'부터 'z'까지 1씩 증가
		 * 규칙성 : ch2는 'a'부터 ch1까지 출력
		 * 		=>	반복횟수 : ch2는 'a'부터 ch1까지 1씩 증가
		 * 			규칙성 : ch2를 출력
		 * 			반복문 종료 후 : 엔터를 출력
		 */
		
		char ch1, ch2;
		for(ch1='a'; ch1<='z';ch1++) {
			for(ch2='a';ch2<=ch1;ch2++) {
				System.out.print(ch2);
			}
			System.out.println();
		}
		
	}

}
