import java.util.Scanner;

// 세 개의 자연수 A, B, C가 주어질 때
//A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램.
public class Baekjoon_2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int[] count = new int[10];
		int mul = 1;
		String s_mul;

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if (a[i] < 100 && a[i] >= 1000)
				break;
			mul = mul * a[i];
		} // 세 자연수를 입력받고, 곱한값을 변수 mul에 저장
		
		s_mul = Integer.toString(mul); // 곲한값을 String으로 형변환
		
		for (int i = 0; i < s_mul.length(); ++i) {
            count[s_mul.charAt(i) - '0']++;
        } // String을 다시 char로 형변환 후  다시 정수로 변환하기 위해 '0'을 빼준다.

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		scanner.close();
	}

}
// [어려웠던 부분]
// 곱셈 결과를 어떻게 숫자 하나하나로 분리해야하는가?

// [시도했던 방식]
// 결과값을 string으로 형변환 후 카운팅을 시도하였으나 실패.

// [실패한 이유]
// String을 char로 형변환 하는 과정이 없었다.

// [다른 방식]
// 10~9 인덱스룰 생성한 후, 결과값을 10으로 나눈 후 몫과 일치하면 해당하는 인덱스값에 1 더하기. 