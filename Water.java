public class Water {
	public synchronized void drinkWater(String contenderName) {
		System.out.println(contenderName + " has taken a sip of water.");

		// Characters have different drinking times
		try {
			if (contenderName.equals("Steve")) {
				Thread.sleep(500);
			} else if (contenderName.equals("Alex")) {
				Thread.sleep(1000);
			} else if (contenderName.equals("Bob")) {
				Thread.sleep(1500);
			} else {
				Thread.sleep(300);
			}
		} catch (InterruptedException e) {
			System.out.println(contenderName + " spilled water.");
		}

		System.out.println(contenderName + " has finished drinking.");
	}
}
