package ch03.for10;

//6. do~while문을 이용해서 1부터 10까지 합을 출력하세요
public class Resolve6 {
	public static void main(String[] args) {
		int i=1, sum=0;
		do {
			sum = sum + i;
			System.out.println("누적 : " + sum);
			i++;
		}while(i<=10);
		System.out.println("1~10의 총합 : " + sum);
	}
}
