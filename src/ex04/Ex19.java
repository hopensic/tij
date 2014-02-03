package ex04;

import java.util.Random;

public class Ex19 {

	private double[][] arr;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ex19 a = new Ex19();
		a.produce(2, 3, 10f, 20f);
		a.print(2, 3);

	}

	public void produce(int len1, int len2, double c1, double c2) {
		Random r = new Random();
		arr = new double[len1][len2];
		for (int i = 0; i < len1; i++)
			for (int j = 0; j < len2; j++)
				arr[i][j] = c1 + (c2 - c1) * r.nextDouble();
	}

	public void print(int len1, int len2) {
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++)
				System.out.print(arr[i][j] + ",");
			System.out.println();
		}
	}
}
