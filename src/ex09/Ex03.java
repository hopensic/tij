package ex09;

public class Ex03 {

	public static void main(String[] args) {
		try {
			throw new MyE("mye");
		} catch (MyE e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
