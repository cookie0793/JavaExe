package ch09.interface12;

// 확장팩의 새로운 캐릭터
public class Zealot implements StarUnit{

	@Override
	public void walk() {
		System.out.println("성큼성큼**");
		
	}

	@Override
	public void attack() {
		System.out.println("휙휙**");
		
	}

	@Override
	public void die() {
		System.out.println("으윽**");		
	}

}
