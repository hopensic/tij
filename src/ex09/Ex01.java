package ex09;

import tools.P;

public class Ex01 {

	public static void main(String[] args) {
		try {
			throw new Exception("aaaa");
		} catch (Exception e) {
			P.lnrint(e.getMessage());
		} finally {
			P.lnrint("hhhhhhhhhh");
		}
	}

}
