import java.util.Scanner;

// 문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램
public class Chapter06_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다. >>");
		String line = scanner.nextLine();

		for (int i = 1; i <= line.length(); i++) {
			System.out.print(line.substring(i));
			System.out.println(line.substring(0, i));
		}

	}

}

// [substring 함수]
// line.substring(i) = i는 시작위치. i부터 문자열 끝까지를 반환한다.
// line.substring(0, i) = 0부터 i번째 전까지 반환한다.
// 반복문에서 사용할 때 i값으로 시작(끝)위치를 지정해도 되지만, 
// 그 외에는 정수를 사용하는 것이 일반적.