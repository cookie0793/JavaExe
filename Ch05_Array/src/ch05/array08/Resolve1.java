package ch05.array08;

//1. 정수 배열 5개를 할당하고
//Arrays.sort를 활용해서 최소값과 최대값을 얻으세요

import java.util.Arrays;

public class Resolve1 {
	public static void main(String[] args) {
		int[] scores = { 3, 2, 5, 4, 1 };
		Arrays.sort(scores);

		System.out.println("최소값은 " + scores[0]);
		System.out.println("최대값은 " + scores[scores.length - 1]);
	}
}
