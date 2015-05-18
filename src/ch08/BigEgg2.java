package ch08;

import tools.P;

class Egg2 {
	public Egg2() {
		P.lnrint("New Egg2");
	}

	protected class Yolk {
		public Yolk() {
			P.lnrint("Egg2.yolk(");
		}

		public void f() {
			P.lnrint("Egg2.Yolk.f()");
		}
	}

	private Yolk y = new Yolk();

	public void insertYolk(Yolk yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}

}

public class BigEgg2 extends Egg2 {

	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			P.lnrint("BigEgg2.yolk()");
		}

		public void f() {
			P.lnrint("BigEgg2.Yolk.f()");
		}
	}

	public BigEgg2() {
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		Egg2 e2 = new BigEgg2();
	}

}
