package java_lhh_day07;

import java.util.Arrays;

public class ArrayInitializeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr1));
		
		arr1 = new int[] {5,4,3,2,1};
		
		System.out.println(Arrays.toString(arr1));
		
		// new를 사용해서 초기화를 진행해야 한다 안하고 진행할 시 두번째 초기화를 못 한다.
		int [] arr2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));
	}

}
