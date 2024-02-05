package ch03.continue11;

//for문을 이용해서 아래 출력
//*
//**
//***
//****
//*****
public class Resolve2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {	// 세로행의 변화
			for(int j=1;j<=i;j++) {	// 가로열의 변화
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
