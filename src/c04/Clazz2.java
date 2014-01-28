package c04;

public final class Clazz2 {
	static private final class NestedNotInnerClazz implements Runnable {
		public NestedNotInnerClazz() {

		}

		@Override
		public void run() {
			System.out.println("Hello");
		}
	}

	public Clazz2() {

	}

	public Runnable getRunnable() {
		return new NestedNotInnerClazz();
	}

	public static void main(String[] args) {
		new NestedNotInnerClazz().run();
	}

}