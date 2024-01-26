package ch03.for10;

import java.util.Scanner;

public class Resolve001 {
	public static void main(String[] args) {
		int[] arrmoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int money, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력 >> ");
		money = sc.nextInt();
		
		for(i=0;i>=money;i++);
		System.out.println(arrmoney + "원 "+ i +"장, ");
	}
}
		