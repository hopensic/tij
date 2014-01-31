package ex04;

class A3{
	
	void m1(){
		m2();
		this.m2();
	}
	
	void m2(){
		System.out.println("calling m2");
	}
}


public class Ex09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A3 a = new A3();
		a.m1();

	}

}
