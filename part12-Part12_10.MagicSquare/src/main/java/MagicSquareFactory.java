
public class MagicSquareFactory {
	private int row, column, value;
	private MagicSquare square;

	public MagicSquare createMagicSquare(int size) {
		square = new MagicSquare(size);
		// implement the creation of a magic square with the Siamese method algorithm here
		// only needs to work for cases of odd integer width
		row = 0;
		column = square.getWidth() / 2;
		value = 1;

		// call the recursive method:
		placeValueOrMove();
		return square;
	}

	private void placeValueOrMove() {
		// base case: every space is filled:
		if (value > square.getHeight() * square.getWidth()) {
			return;
		}
		// recursive case 1: if the space hasn't been filled yet.
		if (square.readValue(column, row) == 0) {
			square.placeValue(column, row, value);
			value++;
			moveUpAndRight();
		} else {
			// recursive case 2: if the space has been filled:
			moveBack();
			moveDown();
		}
		placeValueOrMove();
	}

	private void moveBack() {
		row = row + 1 > square.getHeight() - 1 ? 0 : row + 1;
		column = column - 1 < 0 ? square.getWidth() - 1 : column - 1;
	}

	private void moveDown() {
		row = row + 1 > square.getHeight() - 1 ? 0 : row + 1;
	}

	private void moveUpAndRight() {
		row = row - 1 < 0 ? square.getHeight() - 1 : row - 1;
		column = column + 1 > square.getWidth() - 1 ? 0 : column + 1;
	}

}
