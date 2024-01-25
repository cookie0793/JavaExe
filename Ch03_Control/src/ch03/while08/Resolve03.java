package ch03.while08;

public class Resolve03 {
	public static void main(String[] args) {
		
		//강사님방법
		int i = 1, sum = 0;
		while(i <= 10) {
			sum += i;
			System.out.print(i + " : " + sum);
			System.out.println();
			i++;
		}
		
		System.out.println("1~10의 합은 " + sum);
		}
	}