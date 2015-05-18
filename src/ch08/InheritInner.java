package ch08;

class WithInner {
	class Inner {

	}
}

public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi) {
		wi.super();
	}

	public static void main(String[] args) {

	}

}
