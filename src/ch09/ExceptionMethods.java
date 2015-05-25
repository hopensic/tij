package ch09;

import tools.E;

public class ExceptionMethods {

	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			E.lnrint("getMessage:" + e.getMessage());
			E.lnrint("getLocalizedMessage:" + e.getLocalizedMessage());
			E.lnrint("toString:" + e);
			E.lnrint("printStackTrace():");
			e.printStackTrace();

		}
	}

}
