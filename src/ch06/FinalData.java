package ch06;

import java.util.Random;

import tools.P;
/**
Also add some test comments
*/

class Value {
	//test test2
	int i;

	public Value(int i) {
		this.i = i; 
	};
}

public class FinalData {
	private static Random rand = new Random();
	private String id;

	public FinalData(String id) {
		this.id = id;
	}

	private final int i4 = rand.nextInt(20);
	static final int i5 = rand.nextInt(20);

	private static final Value v3 = new Value(33);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		FinalData fd2 = new FinalData("fd2");
		
		P.lnrint("------------------------");
		System.out.println(fd1.i4);
		System.out.println(fd2.i4);
		P.lnrint("------------------------");

		System.out.println(FinalData.i5);
		System.out.println(FinalData.i5);
	}

}
