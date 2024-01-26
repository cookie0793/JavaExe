package ch05.array04;
//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
import java.util.Scanner;

public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] kor = new int[7];
		
		for (int i = 0; i < kor.length; i++) {
			System.out.print((i+1) + "번째 학생 국어점수 입력 >> ");
			kor[i] = sc.nextInt();
		}
		int total = 0;
		double avg = 0.;
		for (int i = 0; i < kor.length; i++) {
			total += kor[i];
		}

		avg = total / kor.length;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
		// 소숫점2자리까지표시
		sc.close();
		}
	}
