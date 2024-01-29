package ch05.array08;

public class Resolve02 {
	public static void main(String[] args) {
		int[] numArr = { 10, 99, 2, 78, 32 };

		int min, max;
		min = max = numArr[0];

		for (int i = 1; i < numArr.length; i++) {
			// 최소값
			if (min > numArr[i])
				min = numArr[i];

			// 최대값
			if (max < numArr[i])
				max = numArr[i];
		}

		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
	}
}
