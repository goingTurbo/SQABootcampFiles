
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
public class SummerShirt extends AbstractSummerClothe {

	private String collarType;

	/**
	 * @see subclasses.IDemoClassActivity#demoClassActivity()
	 */
	@Override
	public void demoClassActivity() {
		System.out.println("Summer Shirts Selection");
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
	 * @param collarType
	 */
	public SummerShirt(String name, String size, double price, String fabricType, String[] resistance,
			String summerStyleType, String collarType) {
		super(name, size, price, fabricType, resistance, summerStyleType);
		this.collarType = collarType;
	}

	public SummerShirt() {
		super("Dolce Cabana Shirt", "medium", 25.00, "cotton", new String[] { null }, "Polo shirt");
		this.collarType = "Popped";
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnMale()
	 */
	@Override
	public void putClothesOnMale() {
		// TODO Auto-generated method stub
		System.out.println("The male puts on the " + getName() + " very aggressively.");
		System.out.println("He likes the " + this.getCollarType());
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnFemale()
	 */
	@Override
	public void putClothesOnFemale() {
		System.out.println("The female puts on the " + getName() + " very gently.");
		System.out.println("She appreciates " + this.getCollarType());
	}

	/**
	 * @return the collarType
	 */
	public String getCollarType() {
		return collarType;
	}

	/**
	 * @param collarType
	 *            the collarType to set
	 */
	public void setCollarType(String collarType) {
		this.collarType = collarType;
	}

}
