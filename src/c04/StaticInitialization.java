package c04;

class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}

}

class Table {
	static Bowl b1 = new Bowl(1);
}

public class StaticInitialization {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Begin ......");
		Table.b1.f(11);
		System.out.println("End ......");
	}

}
