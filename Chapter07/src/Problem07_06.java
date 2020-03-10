import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String city;
	private String longitude;
	private String latitude;

	public Location(String city, String longitude, String latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String get_city() {
		return city;
	}

	public String get_longitude() {
		return longitude;
	}

	public String get_latitude() {
		return latitude;
	}

	public void find_country(String city) {
		System.out.println(city + "," + longitude + "," + latitude);
	}
}

public class Problem07_06 {

	public static void main(String[] args) {
		HashMap<String, Location> hm = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);
		Location[] location = new Location[4];

		System.out.println("도시, 경도, 위도를 입력하세요.");

		for (int i = 0; i < location.length; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");

			String city = st.nextToken().trim();
			String longitude = st.nextToken().trim();
			String latitude = st.nextToken().trim();

			location[i] = new Location(city, longitude, latitude);
			hm.put(city, location[i]);
		}
		Set<String> key = hm.keySet();
		Iterator<String> it = key.iterator();

		while (it.hasNext()) {
			String city = it.next();
			System.out.println("----------------------------------");
			Location l = hm.get(city);

			System.out.println(l.get_city());
			System.out.println(l.get_longitude());
			System.out.println(l.get_latitude());
			System.out.println("----------------------------------");
		}

		while (true) {
			System.out.print("도시이름>> ");
			String city = scanner.next();
			if (city.equals("그만"))
				break;
			Location l = hm.get(city);
			l.find_country(city);
		}
		scanner.close();

	}

}