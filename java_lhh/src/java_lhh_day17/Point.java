package java_lhh_day17;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point {
	/**
	 * 이름이 같은 클래스이어도 serialVersionUID가 다르면 읽어오지 못함
	 */
	//private static final long serialVersionUID = -
	//private int x, y;	
}
