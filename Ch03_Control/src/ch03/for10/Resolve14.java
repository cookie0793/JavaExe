package ch03.for10;

import java.util.Scanner;

public class Resolve14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단의 출력하고 싶은 단의 숫자 입력 >>");
		int dan = sc.nextInt();
		for(int i=1;i<=9;i++)
			System.out.printf("%d * %d = %d\n",
					           dan, i, dan*i);
		sc.close();
	}
}