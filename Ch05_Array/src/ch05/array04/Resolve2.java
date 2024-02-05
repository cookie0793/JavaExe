package ch05.array04;

//2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
public class Resolve2 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "임꺽정", "장길산",
				"일지매", "차돌바위", "Albert", "James",
				"Alex", "Jenny", "Kerry"};
		System.out.println("이름은 모두 " + names.length);
		
		for(int i=names.length-1;i>=0;i--)
			System.out.print(names[i] + ", ");
		System.out.println();
	}
}
