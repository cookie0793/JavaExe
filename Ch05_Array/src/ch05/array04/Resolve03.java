package ch05.array04;

import java.util.Scanner;

public class Resolve03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<7;i++) {
			int total = 0;
			double avg = 0.0;
			System.out.println((i+1) + "학생 학점 입력 >> ");
			int score = sc.nextInt();
			total += score;
		}
		avg = (double)total/7;
		
		System.out.println("총점은 ");
		}
	}
}
