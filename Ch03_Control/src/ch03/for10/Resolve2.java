package ch03.for10;

public class Resolve2 {
	public static void main(String[] args) {
	
	
	for(int i=1;i<=99;i++) {
		boolean a=false;
		boolean b=false;
		
		int num = i % 10;
		if(num == 3 || num == 6 || num == 9) {
			a = true;
		}
		
		num = i /10;
		if(num ==3 || num == 6 || num == 9) {
			b = true;
		}
		if (a&&b==true) {
			System.out.println("짝짝");}
			else if(a||b==true)
				System.out.println("짝");
			else
				System.out.println(i + " ");
		}
	}
}
