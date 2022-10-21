package Persist;

public class ProductPersist extends Persist{

	private static ProductPersist uniqueInstance = new ProductPersist();
	
	public static ProductPersist getUniqueInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new ProductPersist();
		return uniqueInstance;
	}
}
