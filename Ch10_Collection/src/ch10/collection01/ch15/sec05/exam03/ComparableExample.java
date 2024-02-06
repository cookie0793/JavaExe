package ch10.collection01.ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();

		//객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		treeSet.add(new Person("임꺽정", 45));
		treeSet.add(new Person("장길산", 25));
		treeSet.add(new Person("일지매", 36));
		treeSet.add(new Person("차돌바위", 45));
		treeSet.add(new Person("머털이", 25));
		treeSet.add(new Person("머털도사", 21));
		treeSet.add(new Person("둘리", 11));
		treeSet.add(new Person("스머프", 25));
		treeSet.add(new Person("미키마우스", 31));
		
		//객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}
	}
}