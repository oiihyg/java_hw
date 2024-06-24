package java_lhh_day16;

public class LambdaEx01 {

	public static void main(String[] args) {

		
		
		A a1 = new A() {
			
			@Override
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		A a2 = (n1, n2)->{
			return n1 + n2;
		};
		
		// 구현부가 한줄인 경우 {}를 생략할 수 있고 {}를 생략하면 return도 같이 생략한다.
		A a3 = (n1, n2)-> n1+n2;
		
		// 매개변수가 1개이면 ()를 생량할 수 있다
		B b1 = n1-> System.out.println(n1);
		
		b1.print(10);
		System.out.println(a3.sum(10, 20));
		
	}

}

interface A{
	int sum(int num1, int num2);
}

interface B{
	void print(int num1);
}

// @FunctionalInterface를 추가하고 추상 메소드가 2개가 되면 에러 발생
@FunctionalInterface
interface C{
	void test();
	//int test2(int a);
}







