public class FractalPractice {
	
	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.delay(0);
		starFractal(t, 100, 5);

	}

	public static void star(Turtle t, double length) {
		for (int i = 0; i < 6; i++) {
			t.forward(length);
			t.backward(length);
			t.right(60);
		}
	}

	public static void starFractal(Turtle t, double length, int level) {
		if (level == 0) {
			star(t, length);
		} else {
			t.forward(length);
			starFractal(t, length/2, level-1);
			t.backward(length);
			t.right(72);
			t.forward(length);
			starFractal(t, length/2, level-1);
			t.backward(length);
			t.right(72);
			t.forward(length);
			starFractal(t, length/2, level-1);
			t.backward(length);
			t.right(72);
			t.forward(length);
			starFractal(t, length/2, level-1);
			t.backward(length);
			t.right(72);
			t.forward(length);
			starFractal(t, length/2, level-1);
			t.backward(length);
			t.right(72);
			
		}
	}
}