package java_lhh_day02;

public class LogicalOperatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//성적이 B학점인지 확인하는 예제
		int score = 85;
		boolean isB;
		/* 성적이 80점 이상이고 90점 미만이다
		 * -> 성적이 80보다 크거나 같고, 성적이 90보다 작다
		 * -> 성적이 80보다 크거나 같다 && 성적이 90보다 작다
		 * -> score >=80 && score < 90
		 */
		isB = score >=80 && score < 90;
		System.out.println(score+"점은 B학점인가요? "+isB);
		score = 75;
		isB = score >=80 && score < 90;
		System.out.println(score+"점은 B학점인가요? "+isB);
		score = 95;
		isB = score >=80 && score < 90;
		System.out.println(score+"점은 B학점인가요? "+isB);

		/*
		 * ||연산자 진리표
		 *  A   B   A||B
		 *  T   T    T
		 *  T   F    T
		 *  F   F    F
		 *  F   T    T
		 *  
		 */
		
		/*
		 * 시험 4과목 중 하나라도 과락일 경우 탈락
		 * 과락은 점수가 40점 미만인 경우
		 * 각 과목의 성적이 다음과 같을 때 과락이 있는지 확인 ㄱㄱ 
		 */
		int sub1 = 60, sub2=100, sub3=30, sub4=80;
		boolean isJ;
		isJ = sub1 > 40 || sub2 > 40 || sub3 > 40 || sub4 > 40;
		System.out.println("은 과락인가요? "+isJ);
		
		/*
		 * !연산자 진리표
		 *  A   !A
		 *  T    F
		 *  F    T    
		 */
		
		/*
		 * 주어진 나이가 미성년자인가?
		 */
		int age = 20;
		boolean isA;
		isA = !(age >= 19);
		System.out.println("미성년자인가요? "+isA);
		
	}

}
