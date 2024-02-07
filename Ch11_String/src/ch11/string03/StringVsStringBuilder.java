package ch11.string03;

/*
 * https://12bme.tistory.com/42
 * 
 * String : immutable(불변)
 * StringBuilder : mutable(변함)
 * StringBuffer : mutable(변함), 멀티스레드 동기화 처리
 */

public class StringVsStringBuilder {

	public static long getStringSpeed() {

		String str = "";
		long start = System.nanoTime(); // 포문이 도는 시간을 체크하는 기능
		for (int i = 0; i < 26; i++)
			str += (char) ('a' + i);
		long end = System.nanoTime();
		System.out.println("String: \t" + str); // \t는 탭이랑 똑같은것이다. 간격을 넓혀줌

		return end - start;
	}

	public static long getStringBuilderSpeed() {

		StringBuilder strBuilder = new StringBuilder(26);
		long start = System.nanoTime();
		for (int i = 0; i < 26; i++)
			strBuilder.append((char) ('a' + i));
		long end = System.nanoTime();
		System.out.println("strBuilder: \t" + strBuilder.toString());

		return end - start;
	}

	public static void main(String[] args) {
		long strMillis = getStringSpeed();
		long strBuilderMillis = getStringBuilderSpeed();
		System.out.println("String 시간 =" + strMillis);
		System.out.println("String 시간 =" + strBuilderMillis);
	}
}
