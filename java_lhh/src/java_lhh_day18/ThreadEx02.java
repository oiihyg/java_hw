package java_lhh_day18;

public class ThreadEx02 {

	public static void main(String[] args) {

		// Runnable 인터페이스를 이용한 쓰레드 생성 예제
		MyTread2 mt = new MyTread2();
		
		Runnable r = ()->{
			for(int i=0;i<10000;i++) {
				System.out.println("-");
			}
		};
		
		// Runnable을 따로 설정하고 쓰레드 Runnable 해도 결과 값은 같다
		//Thread tread = new Thread(mt);
		Thread tread = new Thread(r);
		tread.start();
		
		for(int i=0;i<10000;i++) {
			System.out.println("|");
		}
		
	}

}

class MyTread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("-");
		}
	}
	
}