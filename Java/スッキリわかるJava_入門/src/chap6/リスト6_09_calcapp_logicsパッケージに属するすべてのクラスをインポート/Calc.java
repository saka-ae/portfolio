package chap6.リスト6_09_calcapp_logicsパッケージに属するすべてのクラスをインポート;

//import chap6.リスト6_06_CalcLogicクラスをcalcapp_logicsパッケージに所属させる.calcapp.logics.*;
import chap6.リスト6_06_CalcLogicクラスをcalcapp_logicsパッケージに所属させる.calcapp.logics.CalcLogic;

public class Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		int sum = CalcLogic.add(a, b);
		System.out.format("%d + %d = %d\n", a, b, sum);

		int sub = CalcLogic.subtract(a, b);
		System.out.format("%d - %d = %d\n", a, b, sub);
	}

}
