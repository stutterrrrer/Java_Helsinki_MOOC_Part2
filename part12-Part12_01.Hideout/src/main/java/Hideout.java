import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hideout<T> {
	private T hidden;

	public Hideout() { }

	public void putIntoHideout(T toHide) {
		hidden = toHide;
	}

	public T takeFromHideout() {
		T returned = hidden;
		hidden = null;
		return returned;
	}

	public boolean isInHideout() {
		return hidden != null;
	}
}
