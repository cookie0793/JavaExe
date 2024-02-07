package ch10.collection02.linkedlist01;

public abstract class Employee {
	public String empno;		// 사번
	protected String name;		// 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public void SearchEmployee(String empno) {
		this.empno = empno;
	}
	public void showEmployeeInfo() {
		System.out.println("----------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	public abstract double getMonthPay();	// 추상메서드
}
