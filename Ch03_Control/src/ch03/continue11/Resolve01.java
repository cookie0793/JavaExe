package ch03.continue11;

//for문 1~100까지 정수 중에 3의 배수의 총합 출력

public class Resolve01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++) {
//			int sum = 0;
			if(i%3==0) {
				System.out.println(i + ", ");
				sum += i;
			}
		}
		System.out.println();		
		System.out.println("1~100까지 정수 중에 3의 배수의 총합:" + sum);
	}

}
