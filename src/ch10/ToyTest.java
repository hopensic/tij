package ch10;

import tools.P;

interface HasBatteries {
}

interface Waterproof {

}

interface Shoots {
}

class Toy {
	// Toy() {
	//
	// }

	Toy(int i) {

	}
}

class FancyToy extends Toy implements HasBatteries, Shoots, Waterproof {
	public FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		P.lnrint("Class name: " + cc.getName() + " is interface["
				+ cc.isInterface() + "]");
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("ch10.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			P.lnrint("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);

		Class[] faces = c.getInterfaces();
		for (int i = 0; i < faces.length; i++) {
			printInfo(faces[i]);
		}

		Class cy = c.getSuperclass();
		Object o = null;
		try {
			o = cy.newInstance();
		} catch (InstantiationException e) {
			P.lnrint("Cannot instantiate");
			e.printStackTrace();
			System.exit(1);
		} catch (IllegalAccessException e) {
			P.lnrint("Cannot access");
			System.exit(1);
		}
		P.lnrint("----------------");
		printInfo(o.getClass());

	}

}
