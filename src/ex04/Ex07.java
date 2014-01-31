package ex04;

class Dog2 {
	void bark(int type) {
		System.out.println("int barking");
	}

	void bark(char type) {
		System.out.println("char barking");
	}

	void bark(float type) {
		System.out.println("float barking");
	}

	void bark(double type) {
		System.out.println("double barking");
	}

	void bark(byte type) {
		System.out.println("byte barking");
	}

	void bark(long type) {
		System.out.println("short barking");
	}

	void bark(short type) {
		System.out.println("long barking");
	}

}

public class Ex07 {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		char a = 'x';
		int b = 0;
		float c = 0;
		long dd = 0;
		short e = 0;
		d.bark(dd);
		d.bark(e);
	}
}
