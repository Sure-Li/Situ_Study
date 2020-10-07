package lession1006;

public class Arithmetic {
	public int numHandle(int a, int b, String c) {
		int result = 0;
		switch (c) {
		case "+":
			result = add(a, b);
			break;
		case "-":
			result = dec(a, b);
			break;
		case "*":
			result = mul(a, b);
			break;
		case "/":
			result = div(a, b);
			break;
		case "%":
			result = exDiv(a, b);
			break;
		default:
			System.out.println("输入错误");
			break;

		}
		return result;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int dec(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int exDiv(int a, int b) {
		return a % b;
	}
}
