package ch08.class09;

import java.util.Scanner;

public class answer2 {

	private String[] foods = { "짜장면", "짬뽕", "볶음밥", "탕수육" };

	private int selectNum;
	private Scanner sc = new Scanner(System.in);

	public void viewMenu() {
		for (int i = 1; i < foods.length; i++) {
			System.out.println(i + "." + foods[i]);
		}
	}

	public void selectFood() {
		System.out.println("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}

	public void deliveryFood() {
		String food = foods[selectNum];
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	
	}
}
