package ex08;

import tools.P;

interface II {
	void a();
	
	static class I {
		private int c;

		I(int a) {
			c = a;
		}

		void m() {
			P.lnrint(c);
		}
	}
}


class L implements II{

	@Override
	public void a() {
		P.lnrint("aaaa");
	}
	
}

public class Ex22 {

	public static void main(String[] args) {
		II.I i = new II.I(3);

	}

}
