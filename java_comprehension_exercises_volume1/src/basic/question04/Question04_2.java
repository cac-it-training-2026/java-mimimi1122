package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		int[] ageGroup = { 23, 33, 26, 21, 25, 22 };
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int temporaryAge = Integer.parseInt(reader.readLine());

		ageGroup[3] = temporaryAge;
		System.out.println(ageGroup[3]);
		System.out.println(ageGroup.length);
	}

}
