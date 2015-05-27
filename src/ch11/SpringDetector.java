package ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import tools.P;

public class SpringDetector {
	public static void detectSpring(Class groundHogClass) throws Exception {
		Constructor ghog =
				groundHogClass.getConstructor(new Class[] { int.class });
		Map map = new HashMap();
		for (int i = 0; i < 10; i++) {
			map.put(ghog.newInstance(new Object[] { new Integer(i) }), new Prediction());
		}
		P.lnrint("map= " + map);
		Groundhog gh =
				(Groundhog) ghog.newInstance(new Object[] { new Integer(3) });
		P.lnrint("Looking up prediction for " + gh);
		if (map.containsKey(gh))
			P.lnrint((Prediction) map.get(gh));
		else {
			P.lnrint("Key not found:" + gh);
		}

	}

	public static void main(String[] args) throws Exception {
		detectSpring(Groundhog.class);
	}

}
