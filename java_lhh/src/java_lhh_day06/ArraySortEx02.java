package java_lhh_day06;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[] {1,3,5,7,9,2,4,6,8,10};
		
		// 라이브러리에서 제공하는 정렬 방법
		// Dual-Pivot Quick Sort 알고리즘을 이용하여 정렬
		Arrays.sort(arr);
		
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		// Arrays.toString(배열) : 배열 각 값을[]안에 넣고, 각 값 사이에는 ,를 이용하여 구분하여 출력
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		// Arrays.sort(배열, 정렬방법) : 정렬 방법을 기준으로 배열을 정렬
		//Integer [] arr2 = {1,3,5,7,9,2,4,6,8,10};
		//Arrays.sort(arr2, Collections.reverseOrder());
		//System.out.print(Arrays.toString(arr2));
		
	}

}
