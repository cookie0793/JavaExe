package ch10.collection01.ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();

		// Member 객체 저장
		Member mem0 = new Member("홍길동", 30);
		Member mem1 = new Member("홍길동", 30);

		System.out.println(mem0.hashCode());
		System.out.println(mem1.hashCode());
		
		set.add(mem0);
		set.add(mem1); //내부에서 hashCode() -> equals()비교

		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
	
	}
}