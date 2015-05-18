package ex08;

import tools.P;

class G1 {
	G1(String str) {
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

public class Ex20 {

	public static void main(String[] args) {
		G g = new G("1111");
		G.Inner i = g.new Inner();
		i.mr2();
		i.mo();
		i.mr();
	}

}
