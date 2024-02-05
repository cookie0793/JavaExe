package ch03.for10;

//7. do~while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
//do~while문내에 조건문을 넣어주면 됨
//짝수 조건 if(num % 2 == 0)
public class Resolve7 {
	public static void main(String[] args) {
		int i=1;
		do {
			if(i%2==0)
				System.out.println(i);
			i++;
		}while(i<=10);
	}
}
