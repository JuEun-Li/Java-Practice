class GStack<T> {
	int tos;
	Object[] stck;

	public GStack() {
		tos = 0;
		stck = new Object[10];
	}

	public void push(T item) {
		if (tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}

	public T pop() {
		if (tos == 0)
			return null;
		tos--;
		return (T) stck[tos];
	}
}

public class Chapter07_09 {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");

		for (int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());
		// LA가 가장 늦게 들어왔으므로 가장 먼저 빠져나간다.(출력된다.)

		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);

		for (int n = 0; n < 3; n++)
			System.out.println(intStack.pop());
		// 5가 가장 늦게 들어왔으므로 가장 먼저 빠져나간다.(출력된다.)
	}
}
// 스택은 가장 먼저 들어온 것이 가장 늦게 나가는 구조이다.
