package ch08;

import tools.P;

public class Parcel7 {
	public Wrapping wrap(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 47;
			}
		};
	}
	
	// public Wrapping wrap2(int x) {
	// return new Wrapping(x) {
	// public int value() {
	// return super.value() * 47;
	// }
	// };
	// }

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Wrapping w = p.wrap(10);
		P.lnrint(w.value());
	}

}
