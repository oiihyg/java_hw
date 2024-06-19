package java_lhh_day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionalInterfaceEx01 {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("aa", "1", 21));
		list.add(new Person("bb", "2", 45));
		list.add(new Person("cc", "3", 66));
		
		print(list, c->{
			System.out.println(c.getName());
		});
		
		print(list, c->System.out.println(c.getAge()));
		
		print(list, c->System.out.println(c));
		
		Person p = randomPerson(()->{
			int min=0, max=10000;
			int r = (int)(Math.random()*(max-min+1)+min);
			return new Person("","",r);
		});
		System.out.println(p);
		int r1 = randomNumber(()->{
			int min=0, max=10000;
			int r = (int)(Math.random()*(max-min+1)+min);
			return r;
		});
		System.out.println(r1);
		
		// 원하는 내용 문자열로 불러오기
		printString(list, (p1)->p1.getName());
		printString(list, (p1)->p1.getNum());
		
		System.out.println(list);
		// 나이 하나씩 늘리기
		increaseAge(list, (p1)->{
			p1.setAge(p1.getAge()+1);
			return p1;
		});
		System.out.println(list);
		
		print2(list, p1->p1.getAge()>30);
		print2(list, p1->p1.getName().equals("aa"));
		
	}
	
	public static void print(List<Person> list, Consumer<Person> c) {
		for(Person tmp : list) {
			c.accept(tmp);
		}
	}
	
	public static Person randomPerson(Supplier<Person> p) {
		return p.get();
	}

	public static Integer randomNumber(Supplier<Integer> p) {
		return p.get();
	}
	
	public static void printString(List<Person> list, Function<Person, String> f) {
		for(Person tmp : list) {
			System.out.println(f.apply(tmp));
		}
	}
	
	public static void increaseAge(List<Person> list, UnaryOperator<Person> op) {
		for(int i=0;i<list.size();i++) {
			list.set(i, op.apply(list.get(i))); 
		}
	}
	
	public static void print2(List<Person> list, Predicate<Person> p) {
		// 조건을 만족하는 사람들만 출력 
		for(Person tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
	
}

@Data
@AllArgsConstructor
class Person{
	private String name; // 이름
	private String num; // 주민번호
	private int age; // 나이
	
	@Override
	public String toString() {
		return num + ", " + name + "(" + age + ")";
	}
	
	
	
}