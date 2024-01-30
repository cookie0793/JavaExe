package ch05.array08;

import java.util.Arrays;

public class Resolve03 {
	public static void main(String[] args) {
		int[] numArr = {10, 99, 1, 27, 87};
		
		for(int i=0;i<numArr.length/2;i++) {
			int fIdx = i;
			int lIdx = numArr.length-1-i;
			int pre = numArr[fIdx];
			int suf = numArr[lIdx];
			
			numArr[fIdx] = suf;
			numArr[lIdx] = pre;
		}
		System.out.println(Arrays.toString(numArr));		
	}
}
