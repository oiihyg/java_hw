package day24;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 1+2를 계산하기 위해 sum을 호출함
		 * 원인 : 클래스 메소드에서 객체 메소드를 호출할 수 없다
		 * 결과 : 객체 메소드를 생성 후 호출
		 * 
		 */
		//int num = sum(1,2);
		//=>Ex11 ex = new Ex11();
		//=>int res = ex.sum(1,2);
		//System.out.println(1 + " + "+2+" = "+res);
		
		
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

}
