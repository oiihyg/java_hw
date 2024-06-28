package student;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subject implements Serializable {

	private static final long serialVersionUID = 5214387646301286313L;
	//과목명, 학년, 학기, 중간, 기말, 수행평가
	private String name;
	private int grade;
	private int semester;
	private int midterm;
	private int finals;
	private int performace;

	//한 학생에게 같은 과목명, 학년, 학기 성적이 여러개 있을 수 없기 때문에
	//equals를 과목명, 학년, 학기를 이용하여 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return grade == other.grade && Objects.equals(name, other.name) && semester == other.semester;
	}
	@Override
	public int hashCode() {
		return Objects.hash(grade, name, semester);
	}
	public void update(int midterm2, int finals2, int performace) {
		this.midterm = midterm;
		this.finals = finals;
		this.performace = performace;
	}
	@Override
	public String toString() {
		return name + ", grade=" + grade + ", semester=" + semester + ", midterm=" + midterm
				+ ", finals=" + finals + ", performace=" + performace + getTotal();
	}
	
	private double getTotal() {
		return midterm*0.4+finals*0.5+performace*0.1;
	}
	
	
	
}