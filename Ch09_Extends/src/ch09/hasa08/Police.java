package ch09.hasa08;

public class Police {

	private int clothes; // handCuffs는 권총을 발사하는 행위를 표현

	public Police(int clothes) {
		this.clothes = clothes;
	}

	public void putOnClothes() {
		if (clothes > 0) {
			System.out.println("Smile!");
			clothes--;
		} else {
			System.out.println("Shame...");
		}
	}
}
