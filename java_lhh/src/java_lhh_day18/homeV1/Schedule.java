package java_lhh_day18.homeV1;

import java.io.Serializable;

import lombok.Data;

@Data
//Collections.sort()를 사용하기 위해 Comparable 인터페이스를 구현
//객체로 저장하기 위해 Serializable 인터페이스 구현
public class Schedule implements Comparable<Schedule>, Serializable{
	
	private static final long serialVersionUID = 12345L;
	
	private String date;//날짜
	private String toDo;//할일
	private String detail;//상세
	
	@Override
	public String toString() {
		return "" + date + " " + toDo + " : " + detail + "";
	}
	/* @AllArgsContructor를 안 쓰고 추가한 이유는 날짜 문자열을 Date 객체 문자열로 바꾸는
	 * 작업을 setDate()를 이용하기 위해서
	 * */
	public Schedule(String date, String toDo, String detail) {
		this.date = date;
		this.toDo = toDo;
		this.detail = detail;
	}
	@Override
	public int compareTo(Schedule o) {
		return date.compareTo(o.date);
	}
	
	
	
}