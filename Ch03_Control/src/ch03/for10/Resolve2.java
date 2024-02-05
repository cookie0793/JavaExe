package ch03.for10;

import java.util.Scanner;

//2. 369게임을 작성합니다.
//1~99까지의 정수를 입력받고
//3,6,9중 하나가 있으면 "박수짝"을 출력하고
//2개가 있으면 "박수짝짝"을 출력하세요
//예를 들어 13은 "박수짝"
//36인 경우는 "박수짝짝"을 출력하면 됩니다.
public class Resolve2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {		
			System.out.print("1~99까지 정수 입력(음수면 종료) >> ");
			int num = sc.nextInt();
			if(num < 0)
				break;
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
		}
		System.out.println("End~");
		
		sc.close();
	}
}
