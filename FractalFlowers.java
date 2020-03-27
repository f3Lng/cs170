public class FractalFlowers { //DONE
	
	public static void simpleFlower(Turtle t, double size) {
		t.forward(size * 2/3);
		t.right(135);
		for (int i = 0; i < 7; i++) { //loop for each petal
			t.forward(size/3);
			t.backward(size/3);
			t.left(45);
		}
		t.forward(size * 2/3); //put turtle back in original pos.
		t.left(180);
	}

	public static void fractalFlower(Turtle t, double size, int level) {
		if (level == 0) { //base is stem
			t.forward(size * (2/3));
		} else {
			t.forward(size * 2/3);
			for (int i = 0; i < 8; i++) { //loop for each petal
				t.right(45);
				t.forward(size/3); //petal
				t.backward(size/3); 
				fractalFlower(t, size/3, level - 1); //call method again
			}
			t.backward(size * 2/3); //put turtle back in original pos
		}
	}


	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.delay(2);
		t.penup();
		t.backward(200);
		t.left(90);
		t.pendown();

		simpleFlower(t, 200);

		t.penup();
		t.right(90);
		t.forward(200);
		t.left(90);
		t.pendown();

		fractalFlower(t, 250, 3);

		t.penup();
		t.right(90);
		t.forward(200);
		t.left(90);
		t.pendown();

		fractalFlower(t, 300, 4);
	}













}