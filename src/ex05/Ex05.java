package ex05;

import tools.P;

public class Ex05 {
	public int public_field;
	private int private_field;
	protected int protected_field;

	public Ex05() {
		// TODO Auto-generated constructor stub
	}

	public void publicMethod() {
		P.lnrint("publicMethod");
	}

	private void privateMethod() {
		P.lnrint("privateMethod");
	}

	protected void protectedMethod() {
		P.lnrint("protectedMethod");
	}
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		ex05.public_field=1;
		ex05.private_field=2;
		ex05.protected_field=3;
		
	}

}
