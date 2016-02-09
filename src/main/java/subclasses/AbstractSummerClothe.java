
package subclasses;

/**
 * AbstractWinterClothe //ADDD (description of class)
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
public abstract class AbstractSummerClothe extends AbstractClothe {

	// personal preference was decided to not put the male/female methods from
	// parent class here

	private String summerStyleType;

	/**
	 * @param name
	 * @param size
	 * @param price
	 * @param fabricType
	 * @param resistance
	 * @param summerStyleType
	 */
	public AbstractSummerClothe(String name, String size, double price, String fabricType, String[] resistance,
			String summerStyleType) {
		super(name, size, price, fabricType, resistance);
		this.summerStyleType = summerStyleType;
	}

	/**
	 * @return the summerStyleType
	 */
	public String getSummerStyleType() {
		return summerStyleType;
	}

	/**
	 * @param summerStyleType
	 *            the summerStyleType to set
	 */
	public void setSummerStyleType(String summerStyleType) {
		this.summerStyleType = summerStyleType;
	}

	@Override
	public void displayClothes() {
		super.displayClothes();
		System.out.println("It sure is cold out");
	}

	public void displaySummerStyleType() {
		System.out.println("The su,,er style is " + this.getSummerStyleType());
	}

}
