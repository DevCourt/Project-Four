public class UltimateBattleApp {
	public static void main(String[] args) {
		Water water = new Water();
		Contender contender1 = new Contender("Steve", 1000, 2000, water);
		Contender contender2 = new Contender("Alex", 1500, 3000, water);
		Contender contender3 = new Contender("Bob", 2000, 4000, water);

		Thread thread1 = new Thread(contender1);
		Thread thread2 = new Thread(contender2);
		Thread thread3 = new Thread(contender3);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
