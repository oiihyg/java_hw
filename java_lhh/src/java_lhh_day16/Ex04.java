package java_lhh_day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

public class Ex04 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,2,1,"ccc",60,90,40));
		list.add(new Student(1,1,1,"aaa",80,20,10));
		list.add(new Student(1,1,2,"bbb",50,70,30));
		
		
		/*
		 * 국어 평균, 영어 평균, 수학 평균을 계산해서 출력하는 코드를 작성하세요.
		 * 가능하면 함수형 인터페이스와 메소드를 이용 
		 */
		
		int sumKor = sumKor(list);
		System.out.println("국어 평균 : "+sumKor/(double)list.size());
		int sumEng = sumEng(list);
		System.out.println("영어 평균 : "+sumEng/(double)list.size());
		int sumMth = sumMth(list);
		System.out.println("수학 평균 : "+sumMth/(double)list.size());
		
		
		int sumKor2 = sum(list, s->s.getKor());
		System.out.println("국어 평균 : "+sumKor2/(double)list.size());
		int sumEng2 = sum(list, s->s.getEng());
		System.out.println("영어 평균 : "+sumEng2/(double)list.size());
		int sumMth2 = sum(list, s->s.getMth());
		System.out.println("수학 평균 : "+sumMth2/(double)list.size());
		
		/*
		 * 각 학생의 국어, 영어, 수학 성적을 출력하는 코드를 작성하세요.
		 * 가능하면 함수형 인터페이스와 메소드를 이용
		 */
		
		printKor(list);
		printEng(list);
		printMth(list);
		
		print(list, s->System.out.println("이름 : "+s.getName()+", 국어 : "+s.getKor()));
		print(list, s->System.out.println("이름 : "+s.getName()+", 영어 : "+s.getEng()));
		print(list, s->System.out.println("이름 : "+s.getName()+", 수학 : "+s.getMth()));
		
		// 국어 성적이 80점 이상인 학생을 출력하는 코드를 작성하세요
		printStudent(list, (s)->s.getKor()>=80);
		System.out.println("========================");
		// 1학년 1반 학생들을 출력하는 코드를 작성하세요.
		printStudent(list, s->s.getGrade()==1 && s.getClassNum()==1);
		System.out.println("========================");
		// 1학년 1반 1번 학생을 출력하는 코드를 작성하세요
		printStudent(list, s->s.getGrade()==1 && s.getClassNum()==1 && s.getNum() == 1);
		System.out.println("========================");
		
		Collections.sort(list, (o1, o2) -> {
			if(o2.getGrade() != o2.getGrade())
				return o1.getGrade() - o2.getGrade();
			if(o1.getClassNum() != o2.getClassNum())
				return o1.getClassNum() - o2.getClassNum(); 
			return o1.getNum() - o2.getNum();
		});
		System.out.println(list);
		System.out.println("========================");
		printStudent(list, s->true);
		System.out.println("========================");
		
		// 국어 성적 순으로 정렬
		Collections.sort(list, (o1, o2)-> o2.getKor() - o1.getKor());
		System.out.println(list);
		
	}
	
	public static void printStudent(List<Student> list, Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
	
	public static void print(List<Student> list, Consumer<Student> c) {
		for(Student tmp : list) {
			c.accept(tmp);
		}
	}
	
	private static void printMth(List<Student> list) {
		for(Student tmp : list) {
			System.out.println("이름 : "+tmp.getName()+", 수학 : "+tmp.getMth());
		}
	}
	private static void printEng(List<Student> list) {
		for(Student tmp : list) {
			System.out.println("이름 : "+tmp.getName()+", 영어 : "+tmp.getEng());
		}
	}
	private static void printKor(List<Student> list) {
		for(Student tmp : list) {
			System.out.println("이름 : "+tmp.getName()+", 국어 : "+tmp.getKor());
		}
	}

	public static int sum(List<Student> list, Function<Student, Integer> f) {
		int sum = 0;
		for(Student tmp : list) {
			sum += f.apply(tmp);
		}
		return sum;
	}
	
	public static int sumKor(List<Student> list) {
		int sum = 0;
		for(Student tmp : list) {
			sum += tmp.getKor();
		}
		return sum;
	}
	public static int sumEng(List<Student> list) {
		int sum = 0;
		for(Student tmp : list) {
			sum += tmp.getEng();
		}
		return sum;
	}
	public static int sumMth(List<Student> list) {
		int sum = 0;
		for(Student tmp : list) {
			sum += tmp.getMth();
		}
		return sum;
	}
}

@Data
@AllArgsConstructor
class Student{
	@NonNull
	private int grade, classNum, num;
	@NonNull
	private String name;
	private int kor, eng, mth;
	@Override
	public String toString() {
		return name + ", " + grade + ", " + classNum + ", " + num + ", kor=" + kor
				+ ", eng=" + eng + ", mth=" + mth;
	}
	
	
}