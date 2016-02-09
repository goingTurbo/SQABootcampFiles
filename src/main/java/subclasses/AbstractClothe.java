package subclasses;

import java.util.Arrays; //was added because of the class  variables having one of them being an array

//the implements goes to all the subclasses by default
public abstract class AbstractClothe implements IDemoClassActivity {
	// this will make it
	// so the
	// kids
	// can't
	// make instances of the objects in this
	// level

	private String name;
	private String size;
	private double price;
	private String fabricType;
	private String[] resistance;

	public void displayClothes() {
		System.out.println("Clothe " + name + " is being displayed...");
		System.out.println("The male puts it on:");
		this.putClothesOnMale();
		System.out.println("The female puts it on:");
		this.putClothesOnFemale();
		this.toString();
	}

	public void customizeClothes() {
		System.out.println("The user has decided to customize their " + this.getName() + " which is made of "
				+ this.getFabricType() + " and costs " + (this.getPrice() + 20.00) + " to be customized.");
	}

	// this will only executed when 'displayClothe()' is executed, which can
	// also
	// be executed by the subclasses via the displayClothe() method
	public abstract void putClothesOnMale(){
		
	}

	// this will only executed when 'displayClothe()' is executed, which can
	// also
	// be executed by the subclasses via the displayClothe() method
	public abstract void putClothesOnFemale(){
		
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Clothe [name=" + name + ", size=" + size + ", price=" + price + ", fabricType=" + fabricType
				+ ", resistance=" + Arrays.toString(resistance) + "]";
	}

	/**
	 * @param name
	 * @param size
	 * @param price
	 * @param fabricType
	 * @param resistance
	 */
	// Parameterized constructor
	public AbstractClothe(String name, String size, double price, String fabricType, String[] resistance) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.fabricType = fabricType;
		this.resistance = resistance;

	}

	// Default constructor
	public AbstractClothe() {
		super();
		this.name = "No name";
		this.size = "Medium";
		this.price = 5.00;
		this.fabricType = "Cotton";
		this.resistance = new String[] { "None" };
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the fabricType
	 */
	public String getFabricType() {
		return fabricType;
	}

	/**
	 * @param fabricType
	 *            the fabricType to set
	 */
	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	/**
	 * @return the resistance
	 */
	public String[] getResistance() {
		return resistance;
	}

	/**
	 * @param resistance
	 *            the resistance to set
	 */
	public void setResistance(String[] resistance) {
		this.resistance = resistance;
	}

}
