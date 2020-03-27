public class TurtleSpiral { //DONE
	
	public static void turtleSpiral(Turtle t, double size, double minSize) {
		if (size <= minSize) { //if size is less than or equal to minSize, do nothing
			return;
		} else {
			t.forward(size);
			t.right(90);
			turtleSpiral(t, size*0.9, minSize); //go forward, turn right, call method again
		}
	}

	public static void turtleSpiralIter(Turtle t, double size, double minSize) {
		while (size >= minSize) { 
			t.forward(size);
			t.right(90);
			size = size * 0.9; //update size
		}
	}

	public static void main(String[] args) {
		Turtle t = new Turtle();
		turtleSpiral(t, 100, 10);
		t.penup();
		t.forward(150);
		t.right(180);
		t.pendown();
		turtleSpiralIter(t, 100, 10);
	}
}