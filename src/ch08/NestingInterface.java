package ch08;

import ch08.A.DImp2;
import ch08.A.E;

class A {
	// 接口B，包访问权限
	interface B {
		void f();
	}

	public class BImp implements B {
		public void f() {
		}
	}

	private class BImp2 implements B {
		public void f() {
		}
	}

	class BImp3 implements B {
		public void f() {
		}
	}

	protected class BImp4 implements B {
		public void f() {
		}
	}

	// 接口C,public权限
	public interface C {
		void f();
	}

	class CImp implements C {
		public void f() {
		}
	}

	private class CImp2 implements C {
		public void f() {
		}
	}

	public class CImp3 implements C {
		public void f() {
		}
	}

	protected class CImp4 implements C {
		public void f() {
		}
	}

	// 接口D,private权限
	private interface D {
		void f();
	}

	private class DImp implements D {
		public void f() {
		}
	}

	public class DImp2 implements D {
		public void f() {
		}
	}

	class DImp3 implements D {
		public void f() {
		}
	}

	protected class DImp4 implements D {
		public void f() {
		}
	}

	public D getD() {
		return new DImp2();
	}

	private D dRef;

	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}

	// 嵌套接口
	interface E {
		interface G {
			void f();
		}

		public interface H {
			void f();
		}

		void g();
	}
}

public class NestingInterface {
	public class BImp implements A.B {
		public void f() {
		}
	}

	class CImp implements A.C {
		public void f() {
		}
	}

	class EImp implements E {
		public void g() {
		}
	}

	class EGImp implements E.G {
		public void f() {
		}
	}

	class EImp2 implements E {
		public void g() {
		}

		class EG implements E.G {
			public void f() {
			}
		}
	}

	// main函数
	public static void main(String[] args) {
		A a = new A();
	}
}
