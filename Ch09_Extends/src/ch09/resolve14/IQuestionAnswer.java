package ch09.resolve14;

import java.util.Scanner;

public interface IQuestionAnswer {
	public void question();				// 문제출력
	public void answer(Scanner sc);		// 해답풀이
	public boolean isRun();				// 계속진행여부
}
