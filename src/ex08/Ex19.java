package ex08;

import tools.P;

class G {
	G(String str) {
		s = str;
	}

	private String s;

	private void m1() {
		P.lnrint(s);
	}

	private void m2(String ss) {
		P.lnrint(ss);
	}
	
	void m3(){
		Inner i = new Inner();
		i.mo();
	}
	

	class Inner {
		void mo() {
			s = "aaa";
		}

		void mr() {
			m2(s);
		}

		void mr2() {
			m1();
		}
	}
}

public class Ex19 {

	public static void main(String[] args) {
		G1 g = new G1("1111");
		G1.Inner i = g.new Inner();
		i.mr2();
		i.mo();
		i.mr();
	}

}
