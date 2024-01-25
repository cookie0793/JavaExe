package ch03.control03;

import java.util.Scanner;

public class ifEx {
	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 점수 입력 >> ");
		score = sc.nextInt();
		
		// 위의 조건문이 아닐 때 
		if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else
			System.out.println("A학점은 아닙니다.");
		
		sc.close();
	}

}
