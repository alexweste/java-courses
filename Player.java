public class Player {
	int number = 0; // создаём перменную для хранения варианта загаданного числа
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println ("i'm guessing " + number);
	}

}
