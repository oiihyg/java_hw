package java_lhh_day18;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SynchronizedEx02 {

	public static void main(String[] args) {

		// 은행 잔고를 통한 동기화 블록 예제
		BankBook2 bankBook = new BankBook2("홍길동", 0);
		//Coustomer c1 = new Coustomer("홍길동", bankBook);
		//Coustomer c2 = new Coustomer("홍킴동", bankBook);
		
		//Thread t1 = new Thread(()->c1.deposit(10000));
		//Thread t2 = new Thread(()->c2.deposit(10000));
		
		
	}

}

class Coustomer{
	private String name;
	private BankBook2 bankBook;
	
	public void deposit(int money) {
		synchronized (bankBook) {
			int balance = bankBook.getBalance();
			bankBook.setBalance(balance+money);
			
			// 현재 쓰레드를 2초간 멈춤
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+" : "+bankBook.getBalance());
			
		}
		
	}
}

@Data
@AllArgsConstructor
class BankBook2{
	private String name;
	private int balance;
	
}