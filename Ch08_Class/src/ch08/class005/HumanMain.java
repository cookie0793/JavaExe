package ch08.class005;

public class HumanMain {
	public static void viewInfo(Human human) {
		System.out.println("이름 : " + human.name);
		System.out.println("나이 : " + human.age);
		System.out.println("학점 : " + human.score);
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		human.name = "홍길동";
		human.age = 24;
		human.score = 4.5;
		
		viewInfo(human);
	}

}
