package java_lhh_day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class EX04 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 * 1~45사이의 중복되지 않은 6개의 번호와 1개의 보너스 번호를 랜덤으로 생성하고,
		 * 사용자가 번호를 6개 입력해서 몇등인지 맞추는 로또 예제
		 * 1등 : 번호 6개가 일치
		 * 2등 : 번호 5개와 보너스 번호 일치
		 * 3등 : 번호 5개가 일치
		 * 4등 : 번호 4개가 일치
		 * 5등 : 번호 3개가 일치
		 * 나머지 꽝
		 */
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		HashSet<Integer> bonus = new HashSet<Integer>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		int min = 1, max = 45;
		
		while(lotto.size()<6) {
			// int r = (int)(Math.random()*(max-min+1)+min);
			Random random = new Random();
			int r = random.nextInt(min,max+1);
			lotto.add(r);
		}
		int r;
		do {
			bonus.clear();
			r = (int)(Math.random()*(max-min+1)+min);
			bonus.add(r);
		}while(lotto.contains(r));
		
		System.out.print("로또 번호~ : "+lotto); // 10이하 숫자는 자동 정렬된다~
		System.out.println(" 보너스 번호~ : "+bonus);
		int lottoCount = 0;
		int bonusCount = 0;
		for(int i=0;i<6;i++) {
			System.out.print("번호 입력 : ");
			number.add(scan.nextInt());
		}
		for(int i=0;i<lotto.size();i++) {
			boolean  a = lotto.contains(number.get(i));
			boolean  b = bonus.contains(number.get(i));
			System.out.println(lotto.contains(number.get(i)));
			if(a == true) {
				lottoCount++;
			}
			if(b == true) {
				bonusCount++;
			}
			
		}
		
		System.out.println("당신이 맞춘 번호는 몇개인가!! : "+lottoCount);
		if(lottoCount == 6) {
			System.out.println("1등 ㅊㅊ");
		}else if(lottoCount == 5 && bonusCount == 1){
			System.out.println("응 2등이야~ ㅊㅊ");
		}else if(lottoCount == 5) {
			System.out.println("응 3등이야~ 그래 여기까진 ㄱㅊ ㅊㅊ");
		}else if(lottoCount == 4) {
			System.out.println("응 4등이야~ ㅅㄱ ㅊㅊ");
		}else if(lottoCount == 3) {
			System.out.println("응 5만원 ㅅㄱ");
		}else {
			System.out.println("꽝 ㅅㄱ 로또 왜 삼?");
		}
		
		
		
	}

}
