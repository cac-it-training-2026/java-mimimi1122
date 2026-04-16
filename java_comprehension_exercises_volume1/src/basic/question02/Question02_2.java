package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		System.out.println("商品の名前と値段を入力してください");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String itemName = reader.readLine();
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
		String str = reader2.readLine();

		int itemPrice = Integer.parseInt(str);
		System.out.println(itemName);
		System.out.println(itemPrice);

	}
}
