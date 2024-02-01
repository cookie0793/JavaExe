package ch09.abstract10;

public abstract class Employee {
	protected String empno;
	protected String name;

	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	public void showEmployeeInfo() {
		System.out.println("-----------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}

	public abstract double getMonthPay(); // 추상메서드
}
