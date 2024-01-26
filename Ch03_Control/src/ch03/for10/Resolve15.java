package ch03.for10;

import java.util.Scanner;

public class Resolve15 {
	public static void method0() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.println("정수 입력(0은 합계 출력 >> ");
			int num = sc.nextInt();
			if(num == 0)
				break;
			sum += num;
		}
		System.out.println("누적합은 " + sum);
		
		sc.close();
	}

	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		int sum = 0;
		while(isRun) {
			System.out.println("정수 입력(0은 합계 출력 >> ");
			int num = sc.nextInt();
			if(num == 0)
				isRun = false;
			sum += num;
		}
		System.out.println("누적합은 " + sum);
		
		sc.close();
	}

	public static void main(String[] args) {
//		method0();
		method1();
	}

}
