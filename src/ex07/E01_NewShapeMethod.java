package ex07;

class Shape {
	void draw() {
	}

	void erase() {
	}

	void print() {
		System.out.println("Base class print()");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle.draw()");
	}

	void erase() {
		System.out.println("Circle.erase()");
	}

}

class Square extends Shape {
	void draw() {
		System.out.println("Square.draw()");
	}

	void erase() {
		System.out.println("Square.erase()");
	}

	void print() {
		System.out.println("Square.print()");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle.draw()");
	}

	void erase() {
		System.out.println("Triangle.erase()");
	}

	void print() {
		System.out.println("Triangle.print()");
	}
}

public class E01_NewShapeMethod {
	public static void main(String args[]) {
		Shape[] s = { new Circle(), new Square(), new Triangle(), };
		for (int i = 0; i < s.length; i++) {
			s[i].draw();
			s[i].erase();
			s[i].print();
		}
	}
}
