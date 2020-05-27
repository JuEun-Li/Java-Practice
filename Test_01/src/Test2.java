
public class Test2 {

	public static void main(String[] args) {
		double a = 0.1;
		a = Math.sqrt(a);
		
		System.out.println((1 / a) * 365);
		System.out.println(365 + 365 * 2.3);
		
		System.out.println("--------------");
		
		double t = 0.6; // 지구의 시간(9분의 5)
		//double tp = (3 * 100000000) * 86400 * 1000; // 빛이 이동한 시간
		
		t = Math.sqrt(t);
		
		System.out.println("내가 구한 값: " + (1 / t) * (4000 / 3));
	}

}
