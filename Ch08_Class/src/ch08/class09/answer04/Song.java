package ch08.class09.answer04;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}

	public void show() {
		String strInfo = "노래제목 : " + title + "\n" +
				"가수 : " + artist + "\n" +
				"앨범제목 : " + album + "\n" +
				"작곡가 : " + composer + "\n" +
				"발표 연도 : " + year + "\n" +
				"앨범 트랙 번호 : " + track + "\n";
		System.out.println(strInfo);	 
	}
}
