/*  Page 224 Exercise 2
	Author: Rish
	Date: 08/01/2019
	Filename: Billing.java
*/
public class Billing
{
	//Method only taking one parameter
	public static double computeBill(double price)
	{
		price = ((price * .08) + price);
		return price;
	}
	//Method only taking two parameters
	public static double computeBill(double price, double quantity)
	{
		price = (((price * .08) + price) * quantity);
		return price;
	}
	//Method taking all three parameters
	public static double computeBill(double price, double quantity, double couponValue)
	{
		price = (((price * .08) + price) * quantity - couponValue);
		return price;
	}
	public static void main(String[] args) {
		System.out.println("Your price is: $" + computeBill(100));
		System.out.println("Your price is: $" + computeBill(100, 2));
		System.out.println("Your price is: $" + computeBill(100, 2, 16));
	}
}


