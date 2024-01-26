package ch03.for10;

import java.util.Scanner;

public class Resolve01 {
	public static void main(String[] args) {
		while(true) {
			int money = 0;

				Scanner sc = new Scanner(System.in);
				System.out.println("돈의 액수를 입금 >> ");
				money = sc.nextInt();
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
						+ "만원 :%d\n"
						+ "오천원 : %d\n"
						+ "천원 : %d\n"
						+ "오백원 : %d\n"
						+ "백원 : %d/n"
						+ "오십원 : %d/n"
						+ "십원 : %d/n"
						+ "일원 : %d/n",
						m50000, m10000, m5000, m1000, m500, m100, m50, m10, m1);
		
				sc.close();
		}
	}
}
