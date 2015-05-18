package ch08;

class D {

}

abstract class E {

}

class Z extends D {
	E makeE() {
		return new E() {

		};
	}
}

