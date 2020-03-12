package chapter03_1;

public class foreachEx {
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };

		int sum = 0;

		for (int k : n) { //n[0] ~ [5]까지 반복
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은" + sum);

		for (String s : names) // names[0] ~ [5]까지 반복
			System.out.print(s + " ");

		System.out.println(); // 줇 바꾸기용

		for (Week day : Week.values()) // week의 갯수(월 화 수 목,,)만큼 반복
			System.out.print(day + "요일");

		System.out.println();
	}

}
