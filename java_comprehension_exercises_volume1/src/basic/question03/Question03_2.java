package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		int basePrice = 1200;
		int tickets = 3;
		int reducedPrice = basePrice - 200;
		int reducedTikets = --tickets;
		int totalPrice = reducedPrice * reducedTikets;
		double taxRate = 1.1;
		int totalWithTax = (int) (totalPrice * taxRate);
		System.out.println(reducedTikets + " " + reducedPrice + " " + totalPrice + " " + totalWithTax);

	}
}
