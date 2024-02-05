package ch03.while08;

public class WhileEx {
	public static void main(String[] args) {
		// while : ()이 true인 동안 계속 반복하라
		
		int i=1;		// 초기식(시작:언제부터)
		while(i<=10) {	// 조건식(종료:언제까지)			
			System.out.print(i + ", ");	// 실행문
			i++;		// 증감식(변화:얼마만큼)
		}
	}
}
