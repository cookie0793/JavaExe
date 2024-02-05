package ch06.method01;

//2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//절대값이 계산되어서 출력되어야 합니다
public class Resolve2 {
	
	public static int abs(int num0, int num1) {
		int result = num0 - num1;
		if(result < 0)
			result = -result;
		return result;
	}
	
	public static void main(String[] args) {
		int num0 = 100, num1 = 200;
		int result = abs(num0, num1);
		System.out.println("절대값은 " + result);
		
		int a = 99, b = 22;
		int result1 = abs(a, b);
		System.out.println("절대값은 " + result1);
	}
}
