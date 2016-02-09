
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
public class WinterAccessory extends AbstractWinterClothe {

	private String accType;

	/**
	 * @see subclasses.IDemoClassActivity#demoClassActivity()
	 */
	@Override
	public void demoClassActivity() {
		System.out.println("Winter Accessory Selection");
		this.displayClothes();
		this.customizeClothes();
		toString();

	}

	/**
	 * @param name
	 * @param size
	 * @param price
	 * @param fabricType
	 * @param resistance
	 * @param liningtype
	 * @param accType
	 */
	public WinterAccessory(String name, String size, double price, String fabricType, String[] resistance,
			String liningtype, String accType) {
		super(name, size, price, fabricType, resistance, liningtype);
		this.accType = accType;
	}

	public WinterAccessory() {
		super("Fur Scarf", "small", 6.50, "fur", new String[] { "wind", "water" }, "Light padding");
		this.accType = "scarf";
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnMale()
	 */
	@Override
	public void putClothesOnMale() {
		System.out.println("The male puts on the " + getName() + " very aggressively.");
		System.out.println("He likes to wear his " + this.getAccType() + " in the winter.");
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnFemale()
	 */
	@Override
	public void putClothesOnFemale() {
		System.out.println("The female puts on the " + getName() + " very gently.");
		System.out.println("She loves that she wore her" + this.getAccType() + " today.");
	}

	/**
	 * @return the accType
	 */
	public String getAccType() {
		return accType;
	}

	/**
	 * @param accType
	 *            the accType to set
	 */
	public void setAccType(String accType) {
		this.accType = accType;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String previous = super.toString();
		return previous + "WinterAccessory [accType=" + accType + "]";
	}

}
