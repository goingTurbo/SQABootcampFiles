
package subclasses;

/**
 * SummerShirt //ADDD (description of class)
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
public class SummerShorts extends AbstractSummerClothe {

	private int shortLengthSize;

	/**
	 * @see subclasses.IDemoClassActivity#demoClassActivity()
	 */
	@Override
	public void demoClassActivity() {
		System.out.println("Summer Shorts Selection");
		this.displayClothes();
		this.customizeClothes();
	}

	/**
	 * @param name
	 * @param size
	 * @param price
	 * @param fabricType
	 * @param resistance
	 * @param summerStyleType
	 * @param shortLengthSize
	 */
	public SummerShorts(String name, String size, double price, String fabricType, String[] resistance,
			String summerStyleType, int shortLengthSize) {
		super(name, size, price, fabricType, resistance, summerStyleType);
		this.shortLengthSize = shortLengthSize;
	}

	public SummerShorts() {
		super("Green shorts", "medium", 14.00, "denim", new String[] { "water" }, "cargo shorts");
		this.shortLengthSize = 22;
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnMale()
	 */
	@Override
	public void putClothesOnMale() {
		// TODO Auto-generated method stub
		System.out.println("The male puts on the " + getName() + " very aggressively.");
		System.out.println("The male thinks " + this.getShortLengthSize() + " is just the right size.");
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnFemale()
	 */
	@Override
	public void putClothesOnFemale() {
		System.out.println("The female puts on the " + getName() + " very gently.");
		System.out.println(
				"The female thinks " + this.getShortLengthSize() + " is not right, she should change the size.");
	}

	/**
	 * @return the shortLengthSize
	 */
	public int getShortLengthSize() {
		return shortLengthSize;
	}

	/**
	 * @param shortLengthSize
	 *            the shortLengthSize to set
	 */
	public void setShortLengthSize(int shortLengthSize) {
		this.shortLengthSize = shortLengthSize;
	}

}
