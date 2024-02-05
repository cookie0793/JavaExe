package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LgTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet - 화면이 선명하다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LgTablet - 음질이 좋다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void readbook() throws InterruptedException {
		System.out.println("LgTablet - 독서하기 편하다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
