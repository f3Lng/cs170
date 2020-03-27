public class FractalSun {  //DONE
	
	public static void sun(Turtle t, double r) {

		t.penup();
		t.left(90);
		t.forward(r);
		t.right(90);
		t.pendown();

		//sun
		for (int i = 0; i < 360; i++) {
			t.forward(2 * r * Math.tan(0.00872665));
			t.right(1);
		}

		t.penup();
		t.left(90);
		t.backward(r);
		t.right(90);

		//put in middle of circle (not on line) to fill
		t.left(20);
		t.forward(r/2);
		t.pendown();
		t.fill();
		t.penup();
		t.backward(r/2);
		t.right(20);

		t.pendown();

		//rays
		for (int i = 0; i < 8; i++) {
			t.forward(2 * r);
			t.backward(2 * r);
			t.left(45);
		}
	}

	public static void fractalSun(Turtle t, double r, int level) {
		int red = 255;
		int green = 50 * level;
		int blue = 0;
		t.color(red, green, blue);
		if (level == 0) {
			return;
		} else {
			sun(t, r);
			for(int i = 0; i < 8; i++) {
				t.forward(r * 2);
				fractalSun(t, r/4, level - 1);
				t.backward(r * 2);
				t.left(45);
			}
		}
	}

	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.delay(0);
		//sun(t, 100);
		fractalSun(t, 100, 5);
	}
}
