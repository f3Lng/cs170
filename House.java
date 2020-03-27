public class House {
	public static void main(String[] args) {
		Turtle bob = new Turtle();
		wall(bob, 80);
		bob.penup();
		bob.forward(50);
		bob.left(90);
		bob.pendown();
		bob.forward(30);
		bob.left(90);
		bob.forward(20);
		bob.left(90);
		bob.forward(30);
		bob.penup();
		bob.right(180);
		bob.forward(45);
		bob.left(90);
		bob.forward(20);
		bob.right(180);
		bob.pendown();
		wall(bob, 20);
		bob.penup();
		bob.forward(40);
		bob.pendown();
		wall(bob, 20);
		bob.penup();
		bob.forward(30);
		bob.left(90);
		bob.forward(30);
		bob.pendown();
		roof(bob, 80);
	}

	public static void wall(Turtle t, double size) {
		for (int i = 0; i < 4; i++) {
		t.forward(size);
		t.left(90);
		}
	}
	public static void roof(Turtle t, double size) {
		for (int k = 0; k < 3; k++) {
			t.forward(size);
			t.left(135);
			t.forward(56.5685424949);
			t.left(90);
			t.forward(56.5685424949);
		}
	}
}