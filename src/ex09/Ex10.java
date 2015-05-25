package ex09;

import tools.P;

class EA extends Exception {
}

class EB extends EA {
}

class EC extends EB {
}

class BaseA {
	void m1() throws EA {
		throw new EA();
	}
}

class BaseB extends BaseA {
	void m1() throws EB {
		throw new EB();
	}
}

class BaseC extends BaseB {
	void m1() throws EC {
		throw new EC();
	}
}

public class Ex10 {

	public static void main(String[] args) {
		BaseC c = new BaseC();
		BaseA a = (BaseA) c;
		try {
			a.m1();
		} catch (EA e) {
			P.lnrint(e);
		}

	}

}
