package ex09;

class A {
	void f() throws MyE2 {
		try {
			g();
		} catch (MyE e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyE2();
		}
	}

	void g() throws MyE {
		throw new MyE("in g()");
	}
}

public class Ex05 {

	public static void main(String[] args) throws MyE2 {
		A a = new A();
		a.f();
	}

}
