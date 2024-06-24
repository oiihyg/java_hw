package java_lhh_day17;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StreamEx01 {

	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				new Person("aaa", 21, "1"),
				new Person("bbb", 25, "1"),
				new Person("ccc", 35, "2"),
				new Person("ddd", 15, "2"));
		
		Stream<Person> stream = list.stream();
		// 성인(20이상)이고 남성만 조회
		// filter(Predicate P) : 조건을 만족하는 요소들만 선택
		// forEach(Consummer C) : 요소를 하나씩 꺼내 처리
		stream.filter(p->p.getAge()>=20)
			.filter(p->p.getGender().equals("1"))
			.forEach(p->System.out.println(p));
		
		// 스트림 다시 사용시 스트림 다시 불러오기
		stream = list.stream();
		// 20살 이상 여성만
		stream.filter(p->p.getAge()>=20)
			.filter(p->p.getGender().equals("2"))
			.forEach(p->System.out.println(p));
		
		
		/*
		 * map(Function<T,R> f) : T를 가공해서 R로 변환시킴
		 * Person 객체에서 이름(String)을 가져와서 반환
		 */
		stream = list.stream();
		stream.map((p)->p.getName())
			.forEach(name->System.out.println(name));
		
		// 등록된 여성 수를 출력
		// 항목에 해당한 개수 출력
		stream = list.stream();
		long count = stream.filter(p->p.getGender().equals("2")).count();
		System.out.println("등록된 여성 수 : "+count);
		
		stream = list.stream();
		count = stream.filter(p->p.getAge()>=20).count();
		System.out.println("등록된 성인 수 : "+count);
		
		// 평균을 구하시오
		stream = list.stream();
		// map이 T룰 가공해서 R로 만들고, mapToInt는 T를 가공해서 Integer로 만듬.
		// mapToInt는 OptionalDouvle로 반환하는데 이유는 객체가 없어서 평균을 구할 수 없으면,
		// 객체를 총해 알 수 있는 메소드를 제공하기 때문에 사용
		OptionalDouble ageAverage = stream.mapToInt(Person::getAge).average();
		if(ageAverage.isPresent()) {
			System.out.println("평균나이 : "+ageAverage.getAsDouble());
		}
		else {
			System.out.println("XXX");
		}
		System.out.println(ageAverage);
		
		
		stream = list.stream();
		List<Person> list2 = stream.filter(p->p.getAge()<20)
				.collect(Collectors.toList());
		System.out.println(list2);
	
	}

}

@Data
@AllArgsConstructor
class Person{
	private String name;
	private int age;
	private String gender;
	
}

