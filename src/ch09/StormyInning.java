package ch09;

import tools.E;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class PopFoul extends Foul {
}

class Strike extends BaseballException {
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

abstract class Inning {
	public Inning() throws BaseballException {
	};

	public void event() throws BaseballException {
	};

	public abstract void atBat() throws Strike, Foul;

	public void walk() {
	}
}

interface Storm {
	void event() throws RainedOut;

	void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
	public StormyInning() throws RainedOut, BaseballException {
	}

	public StormyInning(String s) throws Foul, BaseballException {
	}

	public void event()  {
	}

	public void rainHard() throws RainedOut {
	}

	public void atBat() throws PopFoul {
	}

	// public void walk() throws PopFoul{}
	
//	public void event() throws RainedOut{}
	
	
	

	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			E.lnrint("Pop Foul");
		} catch (RainedOut e) {
			E.lnrint("Rained out");
		} catch (BaseballException e) {
			E.lnrint("Base exception");
		}
		
		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
