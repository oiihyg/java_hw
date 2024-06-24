package java_lhh_day12;

public class MathEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3.14를 소수점 2번째 자리에서 올림하는 코드를 작성하세요.
		 * 10 곱하고 올린다음 다시 0.1 곱하면되는거 아닌가?
		 */
		
		double num = 3.14;
		num = num*10;
		num = Math.ceil(num);
		num = num/10;
		System.out.println(num);
		

	}

}
