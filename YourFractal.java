public class YourFractal { //HOW TO RANDOM
	
	//this fractal will draw a circle with four more circles originating from the edge of the first circle
	//the four circles are placed evenly around the first circle
	//the two on the left and right sides are of consistent radii
	//the two on the top and bottom are of random radii
	//each circle has four circles originating off of it
	//the biggest circles have more red and appear more purple and the smaller circles have less red and appear more blue

	public static void circle(Turtle t, double r) {
		t.penup(); //start in center
		t.left(90);
		t.forward(r);
		t.right(90);
		t.pendown();

		for (int i = 0; i < 360; i++) {
			t.forward(2 * r * Math.tan(0.00872665));
			t.right(1);
		}

		t.penup();
		t.right(90);
		t.forward(r);
		t.left(90); //end in center
	}

	public static void circleFractal(Turtle t, double r, int level) {
		int red = Math.min(50 * level, 255);
		int green = 0;
		int blue = 255;
		t.color(red, green, blue);
		if (level == 0) {
			return;
		} else {
			circle(t, r);

			t.penup();
			t.forward(r);
			t.pendown();

			circleFractal(t, r/2, level - 1);

			t.penup();
			t.backward(2*r);
			t.pendown();

			circleFractal(t, r/2, level - 1);

			t.penup();
			t.forward(r);
			t.left(90);
			t.forward(r);
			t.right(90);
			t.pendown();

			double random3 = (Math.random() * (int)r) + 1; //plus one to protect from random3 == zero because can't divide by zero
			circleFractal(t, random3, level - 1);

			t.penup();
			t.right(90);
			t.forward(2 * r);
			t.left(90);
			t.pendown();

			double random4 = (Math.random() * (int)r) + 1;
			circleFractal(t, random4, level - 1);

			t.penup();
			t.left(90);
			t.forward(r);
			t.right(90);
			t.pendown();
		}
	}

	public static void main(String[] args) {
		Turtle t = new Turtle();
		t.delay(0);
		//pentagonFractal(t, 100, 2);
		//tFractal(t, 200, 12);
		circleFractal(t, 80, 4);

		t.penup();
		t.left(90);
		t.forward(250);
		t.right(90);
		t.pendown();

		circleFractal(t, 80, 6);

		t.penup();
		t.right(90);
		t.forward(500);
		t.left(90);
		t.pendown();

		circleFractal(t, 80, 2);
	}

}