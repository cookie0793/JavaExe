package ch03.continue11;

// for문 1~100까지 정수중에 3의 배수의 총합 출력

public class Resolve1 {
	public static void main(String[] args) {
		int num = 0;
		for(int i=3;i<=100;i+=3) {
			num += i;}
			System.out.println(num);
	}

}
