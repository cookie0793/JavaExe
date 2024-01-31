package ch09.extends05;

public class Father extends GrandFather{
	
	long money = 100000000000000L;
	
	public Father(){
		System.out.println("Father 생성자");
	}
	
	public Father(int score, long money){
		super(score); //GrandFather의 매개변수 생성자 호출
		this.money = money;
		System.out.println("Father 매개변수 생성자");
	}

	
	public void wealth() {
		System.out.println("돈을 많이 벌었다ㅎㅎ");
	}
}
