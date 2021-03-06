package chap06.リスト6_02;

import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {
		IntBinaryOperator func = Main::sub;

		int x = 5;
		int y = 3;

		int z = func.applyAsInt(x, y);

		System.out.printf("%d - %d = %d\n", x, y, z);
	}

	public static int sub(int a, int b) {
		return a - b;
	}

}
