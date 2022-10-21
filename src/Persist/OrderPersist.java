package Persist;

public class OrderPersist extends Persist{
	private static OrderPersist uniqueInstance = new OrderPersist();

	public static OrderPersist getUniqueInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new OrderPersist();
		return uniqueInstance;
	}
}
