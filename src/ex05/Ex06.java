package ex05;

import tools.P;

public class Ex06 {
	public int public_field;
	private int private_field;
	protected int protected_field;

	public Ex06() {
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
		protected_field = 3;
		Ex06 ex06 = new Ex06();
	}
	
	public static void main(String[] args) {
		
		
	}

}
