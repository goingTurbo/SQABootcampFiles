
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
public abstract class AbstractWinterClothe extends AbstractClothe {

	// personal preference was decided to not put the male/female methods from
	// parent class here

	private String liningtype;

	/**
	 * @param name
	 * @param size
	 * @param price
	 * @param fabricType
	 * @param resistance
	 * @param liningtype
	 */
	public AbstractWinterClothe(String name, String size, double price, String fabricType, String[] resistance,
			String liningtype) {
		super(name, size, price, fabricType, resistance);
		this.liningtype = liningtype;
	}

	/**
	 * @return the liningtype
	 */
	public String getLiningtype() {
		return liningtype;
	}

	/**
	 * @param liningtype
	 *            the liningtype to set
	 */
	public void setLiningtype(String liningtype) {
		this.liningtype = liningtype;
	}

	@Override
	public void displayClothes() {
		super.displayClothes();
		System.out.println("It sure is cold out");
	}

	public void displayLiningType() {
		System.out.println("The lining type is " + this.getLiningtype());
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String previous = super.toString();
		return previous + "AbstractWinterClothe [liningtype=" + liningtype + "]";
	}

}
