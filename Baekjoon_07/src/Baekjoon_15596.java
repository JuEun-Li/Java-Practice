

// Java: long sum(int[] a); 
// (클래스 이름: Test) 
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합
class Test{
	long sum(int[] a) {
		long ans = 0;
		for(int i = 0; i < a.length; i++) {
			ans = ans + a[i];
		}
		return ans;
	}
}

public class Baekjoon_15596 {

	public static void main(String[] args) {
		Test te = new Test();
		te.sum();
		
	}

}