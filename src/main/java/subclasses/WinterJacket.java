
package subclasses;

/**
 * WinterJacket //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class WinterJacket extends AbstractWinterClothe {

	private boolean hasHood;

	/**
	 * @see subclasses.IDemoClassActivity#demoClassActivity()
	 */
	@Override
	public void demoClassActivity() {
		System.out.println("Winter jacket Selection");
		this.displayClothes();
		this.customizeClothes();

	}

	/**
	 * @param name
	 * @param size
	 * @param price
	 * @param fabricType
	 * @param resistance
	 * @param liningtype
	 * @param hasHood
	 */
	public WinterJacket(String name, String size, double price, String fabricType, String[] resistance,
			String liningtype, boolean hasHood) {
		super(name, size, price, fabricType, resistance, liningtype);
		this.hasHood = hasHood;
	}

	public WinterJacket() {
		super("Fur coat", "medium", 14.50, "fur", new String[] { "water" }, "extra padding");
		this.hasHood = true;
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnMale()
	 */
	@Override
	public void putClothesOnMale() {
		System.out.println("The male puts on the " + getName() + " very aggressively.");
		System.out.println("He does not care if having a hood is " + this.isHasHood() + " or " + !this.isHasHood());
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnFemale()
	 */
	@Override
	public void putClothesOnFemale() {
		System.out.println("The female puts on the " + getName() + " very gently.");
		System.out.println("She likes that hood being included is " + this.isHasHood());
	}

	/**
	 * @return the hasHood
	 */
	public boolean isHasHood() {
		return hasHood;
	}

	/**
	 * @param hasHood
	 *            the hasHood to set
	 */
	public void setHasHood(boolean hasHood) {
		this.hasHood = hasHood;
	}

}
