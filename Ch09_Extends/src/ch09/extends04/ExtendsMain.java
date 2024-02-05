package ch09.extends04;

/* super는 부모 생성자를 호출하는 것으로
 * 자식 생성자에서 부모 생성자를 통해
 * 초기화할 때 자식 생성자에서 호출해준다.
 * */
public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child(7, 99999L, 72);
		child.handsome();
		child.wealth();
		child.play();
		
		System.out.println("잘생김 점수 : " + child.handsomeScore);
		System.out.println("돈 : " + child.money);
		System.out.println("즐거운 날 : " + child.day);
	}
}
