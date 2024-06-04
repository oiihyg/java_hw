package java_lhh_day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열은 생성 시 초기화가 되는지 보여주는 예제
		int num1; // 변수 생성
		// System.out.println(num1); 초기화를 안하고 진행하면 에러 발생
		num1 = 10; // 변수 초기화 진행
		System.out.println(num1);
		
		int [] arr = new int[3];
		for(int tmp : arr) {
			// 뱌열은 배열 생성 시 각 자료형에 맞는 초기값으로 초기화 됨
			System.out.println(tmp);
		}
		
		// arr[3] = 20; // 잘못된 번지를 접근해서 예외가 발생
		
	}

}


