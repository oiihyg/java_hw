package java_lhh_day14;

import java.util.Objects;
import java.util.regex.Pattern;


public class Contact {
	
	private String name;
	private String number;
	
	// alt+shift+s => Constructor using fields 선택
	public Contact(String name, String number) throws Exception {
		super();
		this.name = name;
		// 아래 setNumber 위에 불러오고 throws 불러오기 
		setNumber(number);
	}
	
	// alt+shift+s => hashCode & equals 선택 중 number만 선택
	// 전화번호가 같으면 등록이 안되고, 수정할 때도 있는 번호느 등록되면 안되기 때문에
	// equals를 오버라이딩 하면 같은 번호인지 아닌지 비교하기 쉽다.
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(number, other.number);
	}
	
	// alt+shift+s => toString 선택 
	// toString을 오버라이딩 하면 이름 : 번호 형태의 문자열이 필요할 때 사용하기 좋다(여러번 필요하기 때문)
	@Override
	public String toString() {
		// 홍길동 : 010-1234-5678
		return name + " : "+number;
	}
	// getter & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) throws Exception {
		// 맞는 번호일 경우 저장하고 아닐경우 예외 발생
		// 010-1234-5678 or 02-123-4567 or 031-1234-5567 형태의 문자열을 처리하기 위한 정규표현식
		String regex = "^\\d{2,3}-\\d{3,4}-\\d{4}$";
		// Pattern.matches 번호가 정규표현식과 다르면 예외처리 발생 하게 만듦
		if(!Pattern.matches(regex, number)) {
			throw new Exception("주어진 번호는 번호 형태가 아닙니다.");
		}
		
		this.number = number;
	}
	
}
