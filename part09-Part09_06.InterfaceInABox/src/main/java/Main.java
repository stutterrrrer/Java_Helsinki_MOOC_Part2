
public class Main {

	public static void main(String[] args) {
		// test your classes here
		Box box = new Box(10);

		box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
		box.add(new Book("Robert Martin", "Clean Code", 1));
		box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

		box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
		box.add(new CD("Wigwam", "Nuclear Nightclub", 1971));
		box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

		System.out.println(box);

		// after making Box packable too, try putting a box inside a box:
		Box smallerBox = new Box(1);
		smallerBox.add(new Book("Drew Neil", "Practical Vim: edit text at the speed of thought", 1));
		System.out.println("the smaller box: " + smallerBox);
		box.add(smallerBox);
		System.out.println("the box with a smaller box inside: " + box);

		// try adding a box to itself... let's fill up the Pandora's box?
		box.add(box);
		System.out.println("box within itself: " + box);
		/* if the box's weight is less than half its capacity:
		throws stackOverflow error;
		 otherwise, nothing happens since it can't be added. */

	}
}