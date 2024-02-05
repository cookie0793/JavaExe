package ch03.while08;

//4. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
//while문내에 조건문을 넣어주면 됨
//짝수 조건 if(num % 2 == 0)
public class Resolve4 {
	public static void method1() {
		int num=1;
		while(num <= 10) {
			if(num%2==0)
				System.out.println(num);
			num++;
		}		
	}
	public static void method2() {
		int num=2;
		while(num <= 10) {
			System.out.println(num);
			num+=2;
		}	
	}
	public static void main(String[] args) {
//		method1();
		method2();
	}

}
