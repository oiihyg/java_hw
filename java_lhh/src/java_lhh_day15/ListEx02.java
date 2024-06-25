package java_lhh_day15;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx02 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ddd");
		list.add("aaa");
		list.add("ccc");
		
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String tmp = list.get(i);
			System.out.print(tmp+" ");
		}
		
	}

}