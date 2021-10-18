import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
	private List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}
	public void add(Card card) {
		cards.add(card);
	}

	public void print() {
		cards.forEach(System.out::println);
	}

	public void sort() {
		Collections.sort(cards);
	}

	@Override
	public int compareTo(Hand compared) {
		return this.sum() - compared.sum();
	}

	private int sum() {
		return cards.stream()
				.mapToInt(Card::getValue)
				.sum();
	}

	public void sortBySuit() {
		Collections.sort(cards, new BySuitInValueOrder());
	}
}
