package chapter03_1;
//[3�� 7��]
//������ 10�� �����ϴ� �迭�� ����� 
//1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. 
//�׸��� �迭�� �� ���ڵ�� ����� ����϶�.

public class chap03_07 {

	public static void main(String[] args) {
		int sum = 0;
		int avg;

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.println("������ ������: " + arr[i]);

			sum += arr[i];
		}
		avg = sum / 10;
		System.out.println("�����: " + avg);
	}

}
