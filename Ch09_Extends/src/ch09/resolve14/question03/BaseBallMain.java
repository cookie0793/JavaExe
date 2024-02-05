package ch09.resolve14.question03;

//main메서드를 실행하는 역할
public class BaseBallMain {
	public static void main(String[] args) {

		System.out.println("******삼진아웃 게임을 시작합니다******");

		// 컴퓨터의 중복되지 않은 3개의 숫자를 생성
		int[] comArr = GeneratorThreeNum.getRandomNum();

		boolean isRun = true;
		while (isRun) {
			// 사용자의 3개 숫자 입력
			int[] userArr = new int[3];
			BaseBallMenu.printOrder(1);
			userArr[0] = BaseBallMenu.getUserNum();
			BaseBallMenu.printOrder(2);
			userArr[1] = BaseBallMenu.getUserNum();
			BaseBallMenu.printOrder(3);
			userArr[2] = BaseBallMenu.getUserNum();

			// 결과 판단
			isRun = DecisionBall.decisionBall(comArr, userArr);
		}
		System.out.println("정확하게 맞추셨습니다~ 축하합니다!");
	}
}
