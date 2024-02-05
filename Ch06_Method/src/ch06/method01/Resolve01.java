package ch06.method01;

import java.util.Scanner;

//1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//작은 값을 반환하는 메서드를 작성하고 사용하세요
public class Resolve01 {

	public static int max(int num0, int num1) {
		int a = 0;
		if(num0>num1)
		a = num0;
		if(num0<num1)
		a = num1;
		
		return a;
	}
	
	public static int min(int num0, int num1) {
		int b = 0;
		if(num0<num1)
			b= num0;
		else
			b=num1;
		
		return b;
	}
	
	
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1번째 정수 입력 >>");
	int num0 = sc.nextInt();
	System.out.println("2번째 정수 입력 >>");
	int num1 = sc.nextInt();
	
	
	int a = max(num0, num1);
	System.out.println("큰 값 >> " + a);
	int b = min(num0, num1);
	System.out.println("작은 값 >> " + b);
}
}