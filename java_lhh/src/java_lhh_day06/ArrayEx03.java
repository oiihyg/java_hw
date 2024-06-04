package java_lhh_day06;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2단의 결과값이 2,4,6,8,...,18을 배열에 저장하고
		 * 배열에 있는 값을 이용하여 구구단 2단을 출력하는 예제
		 */
		
		int [] arr = new int[9];
		
		for(int i=0;i<9;i++) {
			arr[i]= (i+1)*2;
		}
		
		for(int i=0;i<9;i++) {
			System.out.println("2*"+(i+1)+"= "+arr[i]+" ");
		}
		
		// 10개짜리 배열을 만들어서 0번지를 사용하지 않고 1번지 부터 사용
		int arr1 [] = new int[10];
		
		// 배열에 2부터 18까지 저장하는 작업
		for(int i=1;i<arr1.length;i++) {
			arr1[i]=2*i;
		}
		// 배열 출력
		for(int i=1;i<arr1.length;i++) {
			System.out.println("2*"+i+"= "+arr1[i]+" ");
		}
		
		
		
	}

}


