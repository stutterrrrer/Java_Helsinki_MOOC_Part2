import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
	private List<Movable> movables;

	public Herd() {
		movables = new ArrayList();
	}

	public void addToHerd(Movable movable) {
		movables.add(movable);
	}

	public String toString() {
		String herd = "";

		for (Movable movable : movables) {
			herd += movable.toString() + "\n";
		}
		return herd;
	}

	@Override
	public void move(int dx, int dy) {
		for (Movable movable : movables) {
			movable.move(dx, dy);
		}
	}
}
