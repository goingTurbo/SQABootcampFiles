package subclasses;

import org.junit.Test;

public class ClothingTest {

	@Test
	public void test() {
		AbstractClothe clothes[] = { new WinterJacket(), new WinterAccessory(), new SummerShirt(), new SummerShorts() };

		// AbstractWinterClothe clothes2[] = { new WinterJacket(), new
		// WinterAccessory()// ,
		//
		// // new SummerShirt(), <--- Can't use this because there is no
		// // relation between the AbstractWinterClothe and itself
		//
		// // new SummerShorts() <--- Can't use this because there is no
		// // relation between the AbstractWinterClothe and itself
		// };

		for (AbstractClothe clothe : clothes) {
			clothe.demoClassActivity();
		}

	}

}
