package ch03.dowhile09;

public class DoWhileEx {
	public static void main(String[] args) {
		// 1~10까지 출력
		// while은 조건을 검사하고 실행하는 반면
		// do~while은 1번은 무조건 실행하고 난 후 조건 검사하여 반복 결정
		int i=1;					// 초기값(얼마부터)
		do {
			System.out.println(i);	// 실행
			i++;					// 증가(변화량)
		}while(i<=10);				// 조건(언제까지)
	}
}
