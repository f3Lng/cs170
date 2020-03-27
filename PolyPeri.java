public class PolyPeri {
	public static void polyperi(Turtle t, int n, double p) {
		for (int i = 0; i < n; i++) {
			t.forward(p / n);
			t.left(360.0 / n);
		}
	}

	public static void main(String[] args) {
		Turtle dan = new Turtle();
		polyperi(dan, 6, 600);
	}
}