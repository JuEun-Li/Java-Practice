class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int[] tmp = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			tmp[i] = a[i];
		} // tmp에 배열 a의 원소 집어넣기

		for (int i = a.length; i < a.length + b.length; i++) {
			tmp[i] = b[i - a.length];
		} // 배열 a가 들어가고난 후 남은 자리에 b 집어넣기.

		return tmp; // a와 b를 연결한 새로운 배열 리턴.
	}

	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.println(" ]");
	} // 배열 a 출력
}

public class Chapter04_09_re {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);

		ArrayUtil.print(array3);
	}

}

// tmp[]에 a원소 삽입 후 b원소가 삽입 되어야할 위치 설정 연습하기.
// 메소드 내에 return을 사용할 때는 자료형을 지정하여 메소드 선언하기 주의.
