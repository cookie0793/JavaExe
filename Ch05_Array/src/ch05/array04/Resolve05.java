package ch05.array04;

import java.util.Scanner;

public class Resolve05 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int total = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numArr.length; i++) {
			System.out.print((i + 1) + "번째 입력 >>");
			int num = sc.nextInt();
			total += num;
			numArr[i] = num;
		}

		for (int num : numArr)
			System.out.println(num + " ");
		System.out.println();
		System.out.println("총합 : " + total);

		sc.close();
	}
}
