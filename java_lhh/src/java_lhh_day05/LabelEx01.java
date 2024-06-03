package java_lhh_day05;

public class LabelEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
		// 한줄에 숫자를 3개씩으로 수정, break문을 활용해서 사용
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(i*j+" ");
				if(j==3) {
					break;
				}
			}
			System.out.println();
		}
		
		// 라벨 이름 A
		A : for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(i*j+" ");
				if(j==3) {
					// break 라벨 하면 라벨로 지정한 반복문 전체를 중단
					break A;
				}
			}
			System.out.println();
		}
		
	}

}
