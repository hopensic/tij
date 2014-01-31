package ex04;

public class Ex05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++)
			arr[i] = "String:" + i;
		for (String s : arr)
			System.out.println(s);

	}

}
