package ch09;

import java.io.FileNotFoundException;
import java.io.IOException;

import tools.P;

class SomeOtherException extends Exception {
}

class WrapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new FileNotFoundException();
			case 1:
				throw new IOException();
			case 2:
				throw new RuntimeException("Where am I?");
			default:
				return;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

public class TurnOffChecking {

	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		wce.throwRuntimeException(3);
		for (int i = 0; i < 4; i++) {
			try {
				if (i < 3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();
			} catch (SomeOtherException e) {
				P.lnrint("SomeOtherException: " + e);
			} catch (RuntimeException re) {
				try {
					throw re.getCause();
				} catch (FileNotFoundException e) {
					P.lnrint("FileNotFoundException: " + e);
				} catch (IOException e) {
					P.lnrint("IOException: " + e);
				} catch (Throwable e) {
					P.lnrint("THrowable: " + e);
				}
			}
		}
	}

}
