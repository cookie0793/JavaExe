package ch03.control07.ch04.sec03;

public class SwichExpressionsExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default ->{
			System.out.println("손님입니다.");
		}
		}
		
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다.");
		case 'B', 'b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다.");
		}
	}

}
