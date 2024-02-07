package ch11.string02.ch12.sec05;

import java.util.ArrayList;
import java.util.List;

class MyStringBuilder{
	private List<Character> chList = new ArrayList<>();
	
	public MyStringBuilder append(String str) {
		char[] chArr = str.toCharArray();
		for(char ch : chArr)
			/*
			 * Boxing
			 * 기본타입/지역변수 ch는 스택에 존재
			 * chList.add(ch); 이 구문이 처리될 때
			 * char -> Character클래스로 변환된다.
			 * Character클래스 내부에는 char를 보관하고 있다.
			 * ch값은 결국 객체로 변환되어 힙으로 이동한다.
			 * 
			 * 성능 저하 현상
			 */
			chList.add(ch); //char -> Character클래스로 변환
		
		return this;
	}
	public MyStringBuilder insert(int idx, String str) {
		char[] chArr = str.toCharArray();
		for(int i=idx;i<idx+str.length();i++)
			chList.add(i, chArr[i]);
		
		return this;
	}
	@Override
	public String toString() {
		String str = "";
		
		/* UnBoxing현상발생
		 * chList내부에서 Character 클래스 객체로 힙공간에 보관하다가 
		 * 지역변수 char ch에 대입할 때 다시 스택에 존재하는 ch로 값을 전달한다.
		 */
		for(char ch : chList)
			str += ch;
		return str;
	}
			
}

class Human{
	private String name;
	private int age;
	private float height;
	private float weight;
	
	public Human() {
		
	}
	
	public Human(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Human setName(String name) {
		this.name = name;
		return this;
	}

	public Human setAge(int age) {
		this.age = age;
		return this;
	}

	public Human setHeight(float height) {
		this.height = height;
		return this;
	}

	public Human setWeight(float weight) {
		this.weight = weight;
		return this;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}

public class StringBuilderExample {

	public static void main(String[] args) {
		/*StringBuilder는 내부에 char[] 로 문자열을 저장한다.*/
		String data = new StringBuilder().append("DEF").insert(0,  "ABC").delete(3,  4).toString();
		System.out.println(data);
		
		String data1 = new MyStringBuilder().append("def").insert(0,  "abc").toString();
		System.out.println(data1);
		
		Human human0 = new Human("홍길동", 21, 174.3f, 78.5f);
		System.out.println(human0);  // human0.toString();
		
		/*
		Human human1 = new Human();
		human1.setName("임꺽정");
		human1.setAge(33);
		human1.setHeight(180.3f);
		human1.setWeight(98.5f);
		*/
		Human human1 = new Human()
						.setName("임꺽정")
						.setAge(33)
						.setHeight(180.3f)
						.setWeight(98.5f);
		System.out.println(human1);
	}
}









