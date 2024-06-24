package java_lhh_day12;

public class InterfaceIngeritanceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceIngeritanceEx01 a = new InterfaceIngeritanceEx01();
		
		
		
	}

}


interface interfacePA{
	void print();
	void test1();
}

interface interfacePB{
	void print();
	void test1();
}

// interface 해당 가능! 
// print() 메소드가 겹치는데 상속을 받으면 어차피 구현부가 없어서 하나로 합치면 되기 때문에 다중 상속 가능
interface interfaceC extends interfacePA, interfacePB{
	
}

class ClassA{
	void print() {}
	void test2() {}
}
class ClassB{
	void print() {}
	void test2() {}
}
// class는 다중 상속이 안된다
//class ClassC extends ClassA, ClassB{}
