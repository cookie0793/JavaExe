package ch05.array08;

import java.util.Arrays;

//4. 정수 배열 5개를 할당하고
//Arrays.sort를 사용하지 말고
//배열을 오름차순으로 정렬하도록 저장하세요.
//그리고 출력하세요.
public class Resolve4 {
	
	// 선택정렬
	public static void method0() {
		//int[] numArr = {10, 99, 1, 27, 87, 100, 56, 33};
		int[] numArr = new int[10000];
		
		// 난수로 0~100000사이의 임의의 정수를 배열에 저장
		for(int i=0;i<numArr.length;i++) {
			double dVal = Math.random();	// 0~1사이 실수값
			numArr[i] = (int)(dVal*100000);
		}
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0;i<numArr.length;i++) {
			// i번째 데이터를 선택한다.
			// i를 최소값으로 가정한다.
			int sel = numArr[i];
			int minIdx = i;
			// i다음부터 마지막까지 반복
			for(int j=i+1;j<numArr.length;j++) {	
				// 현재 선택한 데이터보다 작은 값이 나타나면
				if(sel > numArr[j]) {
					// 선택을 교체한다.
					minIdx = j;
					sel = numArr[j];
				}		
			}
			
			// 최종적으로 선택된 것이 가장 작은 데이터
			int temp = numArr[i];
			numArr[i] = numArr[minIdx];
			numArr[minIdx] = temp;
		}
		
		System.out.println(Arrays.toString(numArr));
		
	}
	
	// 버블정렬
	public static void method1() {
//		int[] numArr = {10, 99, 1, 27, 87, 100, 56, 33};
		
		int[] numArr = new int[10000];
		
		// 난수로 0~100000사이의 임의의 정수를 배열에 저장
		for(int i=0;i<numArr.length;i++) {
			double dVal = Math.random();	// 0~1사이 실수값
			numArr[i] = (int)(dVal*100000);
		}
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0;i<numArr.length-1;i++) {
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}				
			}
		}
		
		
		System.out.println(Arrays.toString(numArr));
	}
	public static void main(String[] args) {
		method0();
//		method1();
	}
}
