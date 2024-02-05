package ch03.for10;

import java.util.Scanner;

//1. 돈의 액수를 입금하세요
//입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//출력 개수는 단위가 큰 것 순서로 계산합니다
//예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.

public class Resolve1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 무한루프, 계속 반복
		// 반복문 내에 탈출 조건이 있어야 한다.
		while(true) {
			int money = 0;
			System.out.print("돈의 액수를 입금(음수면 종료) >> ");
			money = sc.nextInt();
			if(money < 0)
				break;		// while문을 탈출해라
			int m50000 = money/50000;
			money = money%50000;
			int m10000 = money/10000;
			money = money%10000;
			int m5000 = money/5000;
			money = money%5000;
			int m1000 = money/1000;
			money = money%1000;
			int m500 = money/500;
			money = money%500;
			int m100 = money/100;
			money = money%100;
			int m50 = money/50;
			money = money%50;
			int m10 = money/10;
			money = money%10;
			int m1 = money;
			
			System.out.printf("오만원 : %d\n"
							+ "만원 : %d\n"
							+ "오천원 : %d\n"
							+ "천원 : %d\n"
							+ "오백원 : %d\n"
							+ "백원 : %d\n"
							+ "오십원 : %d\n"
							+ "십원 : %d\n"
							+ "일원 : %d\n", 
							m50000, m10000, m5000, m1000,
							m500, m100, m50, m10, m1);			
		}
		System.out.println("End~");
		
		sc.close();
	}
}
