package ch05.array04;

public class Resolve01 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "임꺽정", "장길산", "일지매", "차돌바위", "Albert", "James", "Alex", "Jenny", "Kerry" };
		System.out.println("이름은 모두 " + names.length);

		for (int i = 0; i < names.length; i++)
			System.out.println(names[i] + ", ");
		System.out.println();

		for (String name : names)
			System.out.println(name + ", ");
		System.out.println();
	}
}
