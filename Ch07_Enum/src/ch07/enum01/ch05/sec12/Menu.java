package ch07.enum01.ch05.sec12;

/*	System.out.println("1. 짜장면");
	System.out.println("2. 짬뽕");
	System.out.println("3. 탕수육");
	System.out.println("4. 유산슬");
	System.out.println("5. 유린기");*/

/*인터페이스의 용법중에는 상수를 만들 때 사용하는 것도 있다.
 * 상수는 일반적으로 대문자로 쓰는것이 관습이다.
 * 변수와는 달리 상수는 값을 바꿀 수 없음.
 */
public interface Menu {
	int ZZAJANGMYUN = 1;
	int ZZAMPONG = 2;
	int TANGSUYUK = 3;
	int YOUSANSUL = 4;
	int YOULINGI = 5;
}
