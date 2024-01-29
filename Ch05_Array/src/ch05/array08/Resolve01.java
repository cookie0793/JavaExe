package ch05.array08;

import java.util.Arrays;

public class Resolve01 {
	public static void main(String[] args) {
		int[] numArr = { 10, 99, 2, 78, 32 };

		System.out.println(Arrays.toString(numArr));
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));

		System.out.println("최소값은 " + numArr[0]);
		System.out.println("최대값은 " + numArr[numArr.length-1]);
	}
}
