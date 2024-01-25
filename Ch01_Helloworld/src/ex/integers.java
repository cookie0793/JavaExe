package ex;

public class integers {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		short var6 = 128; //byte타입 변수에 허용 범위를 초과한 값 대입. 컴파일오류발생
		//byte var6 = 128 에서 short var6 = 128로 변경하니 에러가 발생하지 않음.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
