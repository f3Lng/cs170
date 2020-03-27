public class FractalMickeyMouse { //DONE
	
	public static void mickeyFace(Turtle t, double r) {
		t.penup();
		t.forward(r);
		t.right(90);
		t.pendown();

		//face
		for (int i = 0; i < 360; i++) {
			t.forward(2 * r * Math.tan(0.00872665)); //side length given radius and an angle of 1 degree in radians 
			t.right(1);
		}

		t.penup();
		t.left(90);
		t.backward(r + r/3);
		t.left(90);
		t.forward(r/2);
		t.right(90);
		t.pendown();

		//left eye
		for (int i = 0; i < 360; i++) {
			t.forward(2 * r/4 * Math.tan(0.00872665));
			t.right(1);
		}

		t.penup();
		t.right(90);
		t.forward(r/5);
		t.fill();
		t.backward(r/5);
		t.left(90);
		t.forward(r * 2/3);
		t.pendown();

		//right eye
		for (int i = 0; i < 360; i++) {
			t.forward(2 * r/4 * Math.tan(0.00872665));
			t.right(1);
		}

		t.penup();
		t.right(90);
		t.forward(r/5);
		t.fill();
		t.backward(r/5);
		t.left(90);
		t.backward(r/3);
		t.right(90);
		t.forward(r/2);
		t.left(90);
		t.pendown();

		//nose
		for (int i = 0; i < 360; i++) {
			t.forward(2 * r/8 * Math.tan(0.00872665));
			t.right(1);
		}

		t.penup();
		t.right(90);
		t.forward(r/16);
		t.fill();
		t.backward(r/16);
		t.forward(r*0.75);
		t.left(90);
		t.pendown();

		//right half of smile
		for (int i = 0; i < 65; i++) {
			t.forward(r * 1.2 * Math.tan(0.00872665));
			t.left(1);
		}

		//left half of smile
		for (int i = 0; i < 130; i++) {
			t.right(1);
			t.backward(r * 1.2 * Math.tan(0.00872665));
		}

		//put turtle back in center
		t.penup();
		for (int i = 0; i < 65; i++) {
			t.forward(r * 1.2 * Math.tan(0.00872665));
			t.left(1);
		}
		t.left(90);
		t.forward(r * 0.75);
		t.right(90);
	}

	public static void fractalMickeyMouse(Turtle t, double r, int level) {
		if (level == 0) {
			return;
		} else {
			mickeyFace(t, r);
			t.left(45);
			t.forward(r + r/2); //move to center of next face
			t.right(45);
			fractalMickeyMouse(t, r/2, level - 1);
			t.left(45);
			t.backward(r + r/2);
			t.left(90); 
			t.forward(r + r/2); //move to center of next face
			t.right(135);
			fractalMickeyMouse(t, r/2, level - 1);
			t.left(135);
			t.backward(r + r/2);
			t.right(135);
		}
	}


	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.delay(0);
		t.penup();
		t.left(90);
		t.forward(10);
		t.right(90);
		t.pendown();

		//mickeyFace(t, 200);
		fractalMickeyMouse(t, 200, 6);
	}

}

	























