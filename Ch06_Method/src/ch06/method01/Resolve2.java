package ch06.method01;
//2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//절대값이 계산되어서 출력되어야 합니다

import java.util.Scanner;

//계산하여 출력되는 메서드
public class Resolve2 {
	public static void result(int num0, int num1) {
		int a;
		a=num0-num1;
		
		if(a>0)
		System.out.println("절대값 = " + a);
		
		else if(a<0)
		System.out.println("절대값 = " + -a);
		
	}
	
	//정수를 입력받는 메서드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		
		result(num0, num1);
	
		sc.close();
	}
}