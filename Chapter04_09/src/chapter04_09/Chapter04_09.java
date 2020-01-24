package chapter04_09;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		// 배열 a와 b를 연결한 새로운 배열 리턴
		int temp[] = new int[a.length + b.length]; // a+b 길이의 배열 생성
		int i = 0;
		for (; i < a.length; i++) {
			temp[i] = a[i]; // a[i]의 내용을 temp 배열에 저장
		}
		for (; i < a.length + b.length; i++) {
			temp[i] = b[i - a.length];// a[i]배열의 내용과 겹치지 않게 a배열 길이를 뺀 이후에 b를 저장한다.
		}
		return temp;
	}

	public static void print(int[] a) {
		// 배열 a 출력
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.print("]");
	}
}

public class Chapter04_09 {

	public static void main(String[] args) {

		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		// array1과 array2를 합한 배열을 array3에 저장
		ArrayUtil.print(array3);
	}

}
