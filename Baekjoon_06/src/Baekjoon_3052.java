import java.util.Scanner;

// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
// 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
public class Baekjoon_3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		int[] remainder = new int[42];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			remainder[a[j] % 42] = remainder[a[j] % 42] + 1;
		} // 나머지 값 위치에 나머지 값들을 저장
		for (int j = 0; j < remainder.length; j++) {
			if (remainder[j] != 0)
				count = count + 1;
		} // 배열에 저장 되어있는 값이 있을 경우 카운팅
		System.out.println(count);
		scanner.close();
	}

}
// [어려운 점]
// 나머지 값들을 어떻게 카운팅 할 것인가?

// [시도했던방안]
// 1. 나머지를 저장한 배열의 길이만큼 반복문을 돌린 후, 배열의 값이 다를 때마다 카운팅.
// 2. remainder[] 배열에 나머지 값위치에 나머지 값을 저장. 배열값이 0이 아닌 경우 카운팅
// 		** 나머지 값 위치에 나머지 값을 저장했기 때문에 값이 중복 되면 카운팅 되지 않는다.

// [실패이유]
// 42로 나눈 나머지값이 42가지임에도 불구하고 배열을 10개만 생성했기때문.