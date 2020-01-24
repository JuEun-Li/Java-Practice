package chapter04_09;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		// �迭 a�� b�� ������ ���ο� �迭 ����
		int temp[] = new int[a.length + b.length]; // a+b ������ �迭 ����
		int i = 0;
		for (; i < a.length; i++) {
			temp[i] = a[i]; // a[i]�� ������ temp �迭�� ����
		}
		for (; i < a.length + b.length; i++) {
			temp[i] = b[i - a.length];// a[i]�迭�� ����� ��ġ�� �ʰ� a�迭 ���̸� �� ���Ŀ� b�� �����Ѵ�.
		}
		return temp;
	}

	public static void print(int[] a) {
		// �迭 a ���
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
		// array1�� array2�� ���� �迭�� array3�� ����
		ArrayUtil.print(array3);
	}

}
