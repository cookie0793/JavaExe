package ch05.array04;

import java.util.Arrays;

public class Resolve04 {
	public static void main(String[] args) {
	int[] numArr = new int[10];
	
	for(int i=0;i<numArr.length;i++) {
		numArr[i] = 3*(i+1);
	}
	
	System.out.println(Arrays.toString(numArr));
	
	for(int i=numArr.length-1;i>=0;i--) {
		System.out.print(numArr[i] + " ");
	}
	}
}
