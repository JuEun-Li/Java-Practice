import java.util.Scanner;

public class Baekjoon_11654 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		scanner.close();
		
		int b = (int)a;
		System.out.println(b);
	}

}

// [까먹지 말아야할 것]
// 1. 문자 하나를 입력받을 땐 char형을 사용하기.
// 2. char형을 스캐너로 입력받을 땐 charAt(0)을 추가해주기.
// 3. char값을 int형 변수에 넣을 때는 int로 캐스팅 후 넣어주기.