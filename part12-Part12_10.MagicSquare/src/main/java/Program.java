
public class Program {

	public static void main(String[] args) {
		// Test the MagicSquare class here

		MagicSquareFactory msFactory = new MagicSquareFactory();
		MagicSquare magicSquare = msFactory.createMagicSquare(5);
		System.out.println(magicSquare);

		System.out.println("sum of rows: " + magicSquare.sumsOfRows());
		System.out.println("sum of columns: " + magicSquare.sumsOfColumns());
		System.out.println("sum of diagonals: " + magicSquare.sumsOfDiagonals());

	}
}
