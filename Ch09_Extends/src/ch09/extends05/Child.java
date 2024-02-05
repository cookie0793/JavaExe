package ch09.extends05;

public class Child extends Father{
	
	private float day = 365 + 1.0f/4;
	
	public Child(){
		System.out.println("Child 생성자");
	}
	
	public Child(int score, long money, float day){
		super(score, money);	// Father의 매개변수 생성자 호출
		this.day = day;
		System.out.println("Child 매개변수 생성자");
	}
	
	public void play() {
		System.out.println("인생이 즐겁다^^");
	}
}
