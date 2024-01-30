package ch06.method01;
/*5. star(5);
을 입력하면 
*
**
***
****
*****
위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.*/
public class Resolve5 {
	public static void star(int num) {
		
		for(int a=0;a<num;a++) {
			for(int b=0;b<=a;b++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		System.out.println();
	}

public static void main(String[] args) {
star(3);
star(5);
star(15);
}
}