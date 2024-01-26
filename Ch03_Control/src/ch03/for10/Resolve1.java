package ch03.for10;

import java.util.Scanner;

public class Resolve1 {
	public static void main(String[] args) {
		int money, i;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력 >> ");
		money = sc.nextInt();
		
		while(50000<=money) {
			i = money/50000;
			money= money%50000;
			System.out.println("5만원 " + i + "매, ");
		
			i = money/10000;
			money= money%10000;
			System.out.println("1만원 " + i + "매, ");
			
			i = money/5000;
			money= money%5000;
			System.out.println("5천원 " + i + "매, ");
			
			i = money/1000;
			money= money%1000;
			System.out.println("1천원 " + i + "매, ");
			
			i = money/500;
			money= money%500;
			System.out.println("500원 " + i + "개, ");
			
			i = money/100;
			money= money%100;
			System.out.println("100원 " + i + "개, ");
			
			i = money/50;
			money= money%50;
			System.out.println("50원 " + i + "개, ");
			
			i = money/10;
			money= money%10;
			System.out.println("10원 " + i + "개, ");
			}
		sc.close();
		}
	}