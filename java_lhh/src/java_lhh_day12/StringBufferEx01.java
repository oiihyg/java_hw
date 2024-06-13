package java_lhh_day12;

public class StringBufferEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String과 차이는 String은 수정이 아니라 교체, StrnigBuffer는 수정
		// 프로그램은 
		StringBuffer sb = new StringBuffer("Hello World");
		
		
		// append(문자열) : 문자열을 제일 뒤에 추가
		sb.append("!");
		System.out.println(sb);

		sb.insert(0, "\"");
		sb.append("\"");
		System.out.println(sb);
		
		sb.delete(6, sb.length()-1);
		System.out.println(sb);
		
		
		
		
	}

}
