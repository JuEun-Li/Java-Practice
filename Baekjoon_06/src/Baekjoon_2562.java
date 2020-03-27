import java.util.Scanner;

// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고
// 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

public class Baekjoon_2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = -999;
		int count = 0;
		int[] a = new int[9];

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if (a[i] >= 100)
				break;
			if (max < a[i])
				max = a[i];
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == max)
				break;
			else
				count = count + 1;
		}
		System.out.println(max);
		System.out.println(count + 1); // 최댓값을 만나면 카운팅이 안 된채 반복문이 종료되므로 1을 더해준다.
		scanner.close();
	}

}

// [어려웠던 점]
// 최댓값이 몇 번째에 있는지 어떻게 알아낼 것인가?
// 최댓값의 자리수가 1만큼 적게 출력되는 문제.

// [해결 방법]
// 반복문을 2개 사용. 하나는 최댓값 구하기. 다른 하나는 최댓값 탐색하기.
// 최댓값을 찾지 못하면 카운팅, 최댓값을 찾으면 반복문을 빠져나오게 한다.
// 최댓값을 찾았을 때 카운팅이 채 되기 전에 반복문이 끝나므로, 출력할 때 +1을 해주어야한다.

// [더 생각해볼 것]
// 최댓값을 찾고 그때 바로 자릿값을 출력할 수 있는 방법을 찾아본다.
// i값을 출력하면 더 간단해지지 않을까?