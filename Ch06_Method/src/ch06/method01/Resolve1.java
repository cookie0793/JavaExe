package ch06.method01;
/*
 * 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
 * 작은 값을 반환하는 메서드를 작성하고 사용하세요
*/

import java.util.Scanner;

public class Resolve1 {

	// 큰값을 반환하는 메서드
	public static void big(int num0, int num1) {
		if (num0 < num1)
			;
		System.out.println("큰 값 = " + num1);
	}

	// 작은값을 반환하는 메서드
	public static void small(int num0, int num1) {
		if (num0 < num1)
			;
		System.out.println("작은 값 = " + num0);
	}

	// 정수를 입력받는 메서드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();

		big(num0, num1);
		small(num0, num1);

		sc.close();
	}
}
