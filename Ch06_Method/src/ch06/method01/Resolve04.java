package ch06.method01;

import java.util.Scanner;

//4. gugudan(3);   
//구구단 메서드를 void 리턴형으로 제작하세요.
//3을 입력하면 3단이 출력됩니다.
public class Resolve04 {

	public static void gugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n", dan, i, dan*i);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int a = sc.nextInt();
		gugudan(a);
	}
}
