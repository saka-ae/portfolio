package chap9.リスト9_18_staticキーワードによるフィールドの共有;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();

		System.out.println(Hero._money);
	}

}
