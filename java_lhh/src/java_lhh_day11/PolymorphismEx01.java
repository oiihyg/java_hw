package java_lhh_day11;

public class PolymorphismEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV();
		AirConditioner aircon = new AirConditioner();
		
		turnOn(tv);
		turnOn(aircon);
		
		
	}

	
	
	
	/*
	 * 가전 제품 종류가 20개 이면 trunOn 메소드가 20개이어야 함
	 * 거기에다 trunOff 메소드가 추가된다면 메소드가 총 40개이어야 함
	public static void turnOn(TV tv){
		tv.power = true;
		System.out.println(tv.name + "이 켜졌습니다.");
	}
	public static void turnOn(AirConditioner aircon){
		aircon.power = true;
		System.out.println(aircon.name + "이 켜졌습니다.");	
	}
	
	*/
	
	// 매개변수 다형성을 이용하면 가전 제품 종류에 상관없이 하나의 메소드로 처리할 수 있음
	public static void turnOn(Appliaces app) {
		app.power = true;
		System.out.println(app.name+"이(가) 켜졌습니다");
	}
	
}
class Appliaces{
	boolean power;
	String name = "가전제품";	
}
class TV extends Appliaces{
	public TV() {
		name = "TV";
	}
}
class AirConditioner extends TV{
	
	public AirConditioner() {
		name = "에어컨";
	}
	
	
	
	
}