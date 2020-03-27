public class Fractals2 {
	
	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.left(90);
		t.delay(1);
		tree(t, 150, 10);
	}

	public static void tree(Turtle t, double size, int level) {
		if (level == 0) {
			t.forward(size);
			t.backward(size);
		} else {
			//stem
			t.forward(size);
			//branch 1
			t.left(45);
			tree(t, size * 0.8, level - 1); //tree method itself makes turtle go back
			//branch 2
			t.right(90); //30 + 45
			tree(t, size * 0.8, level - 1);
			t.left(45);
			t.backward(size); //to undo stem
		}
	}

}