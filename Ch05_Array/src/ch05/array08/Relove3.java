package ch05.array08;

import java.util.Arrays;

/*3. 정수 배열 5개를 할당하고
System.out.println(Arrays.toString(numArr));
로 배열을 출력했을 때 거꾸로 출력되도록
배열의 값을 거꾸로 저장하세요.*/
public class Relove3 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		int a=num[4], b=num[3], c=num[2], d=num[1], e=num[0];

		num[0]=a;
		num[1]=b;
		num[2]=c;
		num[3]=d;
		num[4]=e;
		
		System.out.println(Arrays.toString(num));		
	}
}