package ch03.for10;

import java.util.Scanner;

public class Resolve03 {
	
//	public static void methodIf() {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1번째 숫자 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("3번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		boolean bTriangle = false;
		
//		boolean cond0 = num0+num1 > num2;
//		boolean cond1 = num1+num2 > num0;
//		boolean cond2 = num2+num0 > num1;
		
//		bTriangle = cond0 ? (cond1 ? (cond2 ? true : false) : false) : false;
		//조건연산자로 푸는법
		

					
//		if(num0+num1 > num2) &&
//				(num1+num2 > num0) &&
//				(num2+num0 > num1)
//			bTriangle = true;
//		아래의 소스와 같은 의미임.
		
		if(num0+num1 > num2) {
			if(num1+num2 > num0) {
				if(num2+num0 > num1)
					bTriangle = true;
		}
		}
		System.out.println("삼각형의 조건이 " + bTriangle + "입니다");
		sc.close();	
	}
	}
	
//	public static void methodCondOp()
