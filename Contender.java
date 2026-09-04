import java.util.Random;

public class Contender implements Runnable {
	private String name;
	private int heistMoney;
	private int maxRest;
	private int totalMoney;
	private Water water;
	private static boolean heistSuccessful = false;
	private Random random = new Random();

	public Contender(String name, int heistMoney, int maxRest, Water water) {
		this.name = name;
		this.heistMoney = heistMoney;
		this.maxRest = maxRest;
		this.water = water;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getHeistMoney() {
		return heistMoney;
	}

	public int getMaxRest() {
		return maxRest;
	}

	@Override
	public void run() {
		while (!heistSuccessful) {
			try {
				Thread.sleep(random.nextInt(maxRest));
				totalMoney += heistMoney;
				System.out.println(name + " has taken $" + heistMoney + " from the casino heist. Total money $" + totalMoney);

				// Drink water
				water.drinkWater(name);

				if (totalMoney >= 10000) {
					heistSuccessful = true;
					System.out.println(name + " has successfully completed the heist with a total of $" + totalMoney + "!");
				}
			} catch (InterruptedException e) {
				System.out.println(name + " was stopped.");
			}
		}
	}
}