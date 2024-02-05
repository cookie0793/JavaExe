package ch06.method01;

import java.util.Scanner;

//5. star(5);
//을 입력하면 
//*
//**
//***
//****
//*****
//위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.
public class Resolve5 {

	public static void star(int num) {
		for (int i = 1; i <= num; i++) { // 세로행의 변화
			for (int j = 1; j <= i; j++) { // 가로열의 변화
				System.out.print('*');
			}
			System.out.println(); // 한 행을 내려서 시작위치로 이동
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int a = sc.nextInt();
		star(a);
	}
}
