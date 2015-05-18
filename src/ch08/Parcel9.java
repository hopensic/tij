package ch08;

import static java.lang.Math.*;
import tools.P;

public final class Parcel9 {
	private Destination dest(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				cost = round(price);
				if (cost > 100) {
					P.lnrint("Over budget");
				}
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.dest("china", 1.0f);
	}

}
