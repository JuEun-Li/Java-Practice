class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int[] tmp = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			tmp[i] = a[i];
		} // tmp�� �迭 a�� ���� ����ֱ�

		for (int i = a.length; i < a.length + b.length; i++) {
			tmp[i] = b[i - a.length];
		} // �迭 a�� ���� �� ���� �ڸ��� b ����ֱ�.

		return tmp; // a�� b�� ������ ���ο� �迭 ����.
	}

	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.println(" ]");
	} // �迭 a ���
}

public class Chapter04_09_re {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);

		ArrayUtil.print(array3);
	}

}

// tmp[]�� a���� ���� �� b���Ұ� ���� �Ǿ���� ��ġ ���� �����ϱ�.
// �޼ҵ� ���� return�� ����� ���� �ڷ����� �����Ͽ� �޼ҵ� �����ϱ� ����.
