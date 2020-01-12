package chapter03_1;
//[3장 7번]
//정수를 10개 저장하는 배열을 만들고 
//1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
//그리고 배열에 든 숫자들과 평균을 출력하라.

public class chap03_07 {

	public static void main(String[] args) {
		int sum = 0;
		int avg;

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.println("랜덤한 정수들: " + arr[i]);

			sum += arr[i];
		}
		avg = sum / 10;
		System.out.println("평균은: " + avg);
	}

}
