import java.util.ArrayList;
import java.util.Scanner;

// N은 자연수의 갯수
// K는 연속적으로 골라하는 자연수(2 이상 N이하)
public class problem_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();

		int N = scanner.nextInt(); // 자연수의 갯수
		int k = scanner.nextInt(); // 연속적으로 골라야하는 자연수

		for (int i = 1; i <= N; i++) {
			int num = scanner.nextInt();
			ar.add(num);
		} // 1보다 크고 N보다 작은 자연수를 입력받아 모두 ar에 저장.

		// int min = Collections.min(ar); // ar에 저장된 값들중 최소값 찾기.
		int min = 0;
		int count = 0;

		for (int j = 1; j <= N; j = j + (k - 1)) { // N보다 작을 때 까지 반복
			//System.out.println("j의 값:"+j);

			for (int i = 1; i <= k; i++) { // k의 갯수만큼 정수들을 가져온 후
				ar.get(i); // i번째 배열의 수 1개 가져오기
				if (ar.get(i) > min)
					min = i; // k개의 정수들 중 최소값 찾기.

				ar.remove(i); // 인덱스 i 요소 삭제
				ar.add(i, min); // i자리에 min값 삽입
				
				
				
			}
			count = count + 1;
			//System.out.println("count값은: "+count);
		}
		System.out.println(count);
		scanner.close();
	}

}
