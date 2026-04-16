package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_1 {

	public static void main(String[] args) throws IOException {

		System.out.println("名前を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name = reader.readLine();

		System.out.println("好きなスポーツを入力してください");
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

		String sport = reader2.readLine();

		System.out.println(name);
		System.out.println(sport);

	}
}
