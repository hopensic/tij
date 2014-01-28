package c04;

public final class Clazz {
	private final class InnerClazz implements Runnable {
		public InnerClazz() {

		}

		@Override
		public void run() {
			System.out.println(num);
		}
	}

	private int num = 0;

	public Clazz() {

	}

	public Runnable getRunnable() {
		num++;
		return new InnerClazz();
	}

	public static void main(String[] args) {
		Clazz c = new Clazz();
		c.getRunnable().run();
	}

}