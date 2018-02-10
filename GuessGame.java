public class GuessGame {
	// объ€вл€ем переменные дл€ трЄх объектов класса Player
	Player p1;
	Player p2;
	Player p3;
	//в методе startGame создаЄм три объекта класса Player и присваиваем их трЄм переменным экземпл€рам
	public void startGame () {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		//объ€вл€ем 3 переменные дл€ хранени€ вариантов от каждого игрока
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		//объ€вл€ем 3 переменные дл€ хранени€ правильности или неправильности (true или false) ответов игроков.
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		// создаЄм число, которое игроки должны угодать
		int targetNumber = (int) (Math.random() *10);
		System.out.print ("I'm thiking of a number between 0 and 9 ... ");
		
		while (true) {
			System.out.println("Number to guess is " + targetNumber);
			// вызываем метод guess() из каздого заданного объекта класса Player
			p1.guess();
			p2.guess();
			p3.guess();
			// извлекаем варианты ответов каждого игрока (варианты, которые нам выдал метод guess() по каждому игроку) получа€ доступ к их переменным number
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			guessp2 = p2.number;
			System.out.println("Playr two guessed " + guessp2);
			guessp3 = p3.number;
			System.out.println("Player three guesed " + guessp3);
			// свер€ем эти ответы с правильным числом. ≈сли игрок угадал, то присваиваем перменной этого игрока значение true (по умолчанию все значени€ false)
			if (guessp1 == targetNumber) {
				p1isRight = true;
				}
			if (guessp2 == targetNumber) {
				p2isRight = true;
				}
			if (guessp3 == targetNumber) {
				p3isRight = true;
				}
			// если первый или второй или третий игрок угадал (оператор || означает »Ћ»)...
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break; //игра окончена, так что прекращаем цикл
			// иначе остаЄмс€ в цикле и просим игроков сделать ещЄ одну попытку:
				} else {
					System.out.println ("Players will have to try again.");
					}
		}
	}
}