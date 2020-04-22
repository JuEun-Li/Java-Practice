class Song {
	private String title;
	private String artist;
	private String year;
	private String country;
	
	Song(){
		this("title", "artist", "year", "country");
	} // �ȵ带 �ʱ�ȭ�ϴ� ������

	Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	} // �⺻ ������

	public void show() {
		System.out.println(year + "��" + country + "������" + artist + "�� �θ�" + title);
	}
}

public class Chapter04_03 {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen","ABBA","1978","������"); // �⺻ ������ ���� ������ �°� ����.
		song.show(); // ���� ������ ��ü �̸��� ����
	}

}

// ��ü�� �����ϰ� ȣ���ϴ� �������� ��ü�� �̸��� Ŭ������ �̸��� ȥ������ ����.
// ��ü�� �Ű��������� ������ ���� �⺻ �����ڰ� ����� ������� ������.