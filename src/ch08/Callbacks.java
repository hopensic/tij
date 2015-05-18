package ch08;

import tools.P;

interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {
	private int i = 0;

	public void increment() {
		i++;
		P.lnrint(i);
	}
}

class MyIncrement {
	void increment() {
		P.lnrint("Other operation");
	}

	static void f(MyIncrement mi) {
		mi.increment();
	}
}

class Callee2 extends MyIncrement {
	private int i = 0;

	public void incr() {
		i++;
		P.lnrint(i);
	}

	private class Closure implements Incrementable {
		public void increment() {
			incr();
		}

		Incrementable getCallBackReference() {
			return new Closure();
		}
	}
}

class Caller {
	private Incrementable callbackReference;

	Caller(Incrementable cbh) {
		callbackReference = cbh;
	}

	void go() {
		callbackReference.increment();
	}
}

public class Callbacks {

	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		
	}

}
