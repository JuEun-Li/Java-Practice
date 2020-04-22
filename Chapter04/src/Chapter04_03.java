class Song {
	private String title;
	private String artist;
	private String year;
	private String country;
	
	Song(){
		this("title", "artist", "year", "country");
	} // 팔드를 초기화하는 생성자

	Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	} // 기본 생성자

	public void show() {
		System.out.println(year + "년" + country + "국적의" + artist + "가 부른" + title);
	}
}

public class Chapter04_03 {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen","ABBA","1978","스웨덴"); // 기본 생성자 설정 순서에 맞게 적기.
		song.show(); // 내가 설정한 객체 이름에 유의
	}

}

// 객체를 생성하고 호출하는 과정에서 객체의 이름과 클래스의 이름을 혼동하지 말것.
// 객체의 매개변수들을 설정할 때는 기본 생성자가 선언된 순서대로 적을것.