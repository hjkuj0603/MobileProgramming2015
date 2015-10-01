package kr.ac.kookmin.embedded.sales;

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		super();
		discount=0;
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		super(theName, thePrice);
		setDiscount(theDiscount);
	}
	
	public DiscountSale(DiscountSale originalObject) {
		if(originalObject==null){
			System.out.println("Error: null Sale object.");
			System.exit(0);
		}
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		return getPrice()-(getDiscount()*getPrice()*0.01);
	}
	
	public double getDiscount() {
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		if(newDiscount >= 0)
			discount=newDiscount;
		else{
			System.out.println("Error: Negative price.");
			System.exit(0);
		}
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else{
			DiscountSale otherDiscountSale = (DiscountSale) otherObject;
			return (discount==otherDiscountSale.discount);
		}
	}
	
	
	public DiscountSale clone() {
	return new DiscountSale(this);
	}
}