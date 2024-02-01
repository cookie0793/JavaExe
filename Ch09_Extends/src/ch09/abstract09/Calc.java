package ch09.abstract09;

/* [추상 클래스]
 * 1) 일부는 구현돼있지만
 * 2) 1개라도 메서드가 미구현(추상메서드)돼있으면 추상클래스가된다.
 * 3) 설계 목적, 상속을 전제로 한다.
 * 4) 부모에서 정해줄 것은 정해주되, 자식마다 다른 것은 상속을 통해 구현하도록 한다.
 */

public abstract class Calc {
	protected int a, b; //protected = 같은 클래스거나 자식 클래스가 직접 접근할수있게한다.
	
	public void setValue(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}
	
	//추상 메서드(자식이 상속받아서 구현해야 함)
	public abstract int calculate();
		
}
