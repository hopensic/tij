package ex06;


class SelfCounter {
	private static int count = 0;
	private int id = count++;

	public String toString() {
		return "SelfCounter " + id;
	}

	// public int getCount() {
	// return this.count;
	// }
	//
	// public int getId() {
	// return this.id;
	// }

}

class WithFinalFields {
	final SelfCounter scf = new SelfCounter();
	static final SelfCounter scsf = new SelfCounter();

	public String toString() {
		return "scf = " + scf + "\nscsf = " + scsf;
	}
}

public class Ex18 {

	public Ex18() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("First object:");
		System.out.println(new WithFinalFields());
		System.out.println("Second object:");
		System.out.println(new WithFinalFields());

	}

}
