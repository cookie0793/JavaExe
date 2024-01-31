package ch08.class11;

public class WatchTime {
	private int hour, min, sec;
	
	
	public WatchTime(int hour, int min, int sec) {
		System.out.println("this:" + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	 //public void viewTime(Watchtime this) 컴파일하면 이렇게 호출됨
	public void viewTime() {
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	
	}
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum:" + wtNum);
		System.out.printf("wtNum:%x\n", wtNum.hashCode());
		wtNum.viewTime();     //viewTime(wtNum); 컴파일하면 이렇게 호출됨
		
		WatchTime wtNum1 = new WatchTime(13, 23, 33);
		System.out.println("wtNum:" + wtNum1);
		System.out.printf("wtNum:%x\n", wtNum1.hashCode());
		wtNum1.viewTime();        //viewTime(wtNum1); 컴파일하면 이렇게 호출됨
	}
}
