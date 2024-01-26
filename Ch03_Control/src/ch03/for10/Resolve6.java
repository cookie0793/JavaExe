package ch03.for10;

public class Resolve6 {
	public static void main(String[] args) {
		int i=1, sum=0;
		do {
			sum = sum + i;
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println("1~10의 총 합" + sum);
	}

}
