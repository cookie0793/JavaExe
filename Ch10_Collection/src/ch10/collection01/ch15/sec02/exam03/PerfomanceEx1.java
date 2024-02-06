package ch10.collection01.ch15.sec02.exam03;

public class PerfomanceEx1 {
	public static void main(String[] args) {
		long a = 1;

		for (int i=1;i<=32;i++) {
			a = a * 2;
		}
		System.out.println(a);
	}
}
