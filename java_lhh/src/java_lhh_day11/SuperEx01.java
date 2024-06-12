package java_lhh_day11;

public class SuperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c = new Child1(0);
		c.printChild();
		
	}

}


class Parent1{
	
	int num1 = 1;
	
	public void print() {
		System.out.println("num1 : "+num1);
	}
	
	public Parent1(int num1) {
		this.num1 = num1;
	}
	
}

class Child1 extends Parent1{
	
	
	public Child1(int num1) {
		// 부모 클래스의 기본 생성자가 없어서 있는 생성자를 호출
		super(num1);
		this.num2 = num2;
	}

	int num2 = 2;
	
	public void printChild() {
		// 부모클래스에 있는 print를 호출
		super.print();
		System.out.println("num2 : "+num2);
	}
	
}




