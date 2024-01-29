package ch03.continue11;

import java.util.Scanner;

//교재 139page 7번
//Whi

public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		int money = 0, m = 0;
		while(isRun) {
			System.out.println("---------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------");
			System.out.println("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				System.out.println("예금액 > ");
				m = sc.nextInt();
				money += m;
				break;
			case 2:
				System.out.println("출금액 > ");
				
			}
		}
	}

}
