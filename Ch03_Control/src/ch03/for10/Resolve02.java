package ch03.for10;

import java.util.Scanner;

public class Resolve02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~99까지 정수 입력(음수면 종료) >> ");
		int num = sc.nextInt();
		int n10 = num/10;
		int n1 = num%10;
		
		int cnt = 0;
		if(n10==3 || n10==6 || n10==9)
			cnt++;
		if(n1==3 || n1==6 || n1==9)
			cnt++;
		
		if(cnt==1)
			System.out.println("박수짝");
		else if(cnt==2)
			System.out.println("박수짝짝");

		sc.close();
	}

}
