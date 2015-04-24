package ex04;

import java.util.Random;

public class Ex20 {

	private double[][][] arr;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ex20 a = new Ex20();
		a.produce(2, 3, 4, 10f, 20f);
		a.print(2, 3, 4);

	}

	public void produce(int len1, int len2, int len3, double c1, double c2) {
		Random r = new Random();
		arr = new double[len1][len2][len3];
		for (int i = 0; i < len1; i++)
			for (int j = 0; j < len2; j++)
				for (int k = 0; k < len3; k++)
					arr[i][j][k] = c1 + (c2 - c1) * r.nextDouble();
	}

	public void print(int len1, int len2, int len3) {
		for (int i = 0; i < len1; i++) {
			System.out.println("µÚ" + i + "Î¬");
			for (int j = 0; j < len2; j++) {
				System.out.println("µÚ" + i + "" + j + "Î¬");
				for (int k = 0; k < len3; k++)
					System.out.print(arr[i][j][k] + ",");
				System.out.println();
			}
		}
	}
}
