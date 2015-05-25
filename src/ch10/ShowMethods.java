package ch10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import tools.P;

public class ShowMethods {
	private static Pattern p = Pattern.compile("\\w+\\.");

	public static void main(String[] args) {
		if (args.length < 1) {
			P.lnrint("param error");
			System.exit(1);
		}
		int lines = 0;
		try {
			Class c = Class.forName(args[0]);
			Method[] m = c.getMethods();
			Constructor[] ctor = c.getConstructors();
			if (args.length == 1) {
				for (int i = 0; i < m.length; i++) {
					// P.lnrint(p.mm[i].toString().rep);
				}
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			P.lnrint("No such class: " + e);
		}
	}

}
