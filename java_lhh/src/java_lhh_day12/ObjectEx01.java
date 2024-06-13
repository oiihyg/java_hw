package java_lhh_day12;

import java.util.Arrays;

public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// toString 확인 예제
		Test3 t1 = new Test3();
		System.out.println(t1); // 객체로 오면 .toString이 없어도 적용된다.
		
		Test3 [] list = new Test3[3];
		list[0] = new Test3();
		list[1] = new Test3();
		list[2] = new Test3();
		System.out.println(Arrays.toString(list));
		
		// hashCode와 equals 확인 예제
		Student std1 = new Student(1, 1, 1, "홍길동");
		Student std2 = new Student(1, 1, 1, "홍길동");
		Student std3 = new Student(1, 1, 1, "임꺽정");
		Student std4 = new Student(1, 1, 2, "홍길동");
				
		
	}

}

class Student{
	int grade, classNum, num;
	String name;
	
	// 생성자
	public Student(int grade, int classNum, int num, String name) {
		super();
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	
	
	
}



class Test3{
	int num1, num2;

	@Override
	public String toString() {
		return "Test3 [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	/*
	 * toString 방식
	public String toString() {
		return "num : " + num1 + ", num2 : "+num2;
	}
	*/
}