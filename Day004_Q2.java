
public class Day004_Q2 {
	public static void main(String[] args) {
		CashPayment c1 = new CashPayment(15000);
		CashPayment c2 = new CashPayment(20000);
		CreditCardPayment cc1 = new CreditCardPayment(25000, "Rajesh", "25/03/2022", "12345678");
		CreditCardPayment cc2 = new CreditCardPayment(30000, "Jarvis", "09/05/2022", "87654321");
		System.out.println("Cash 1 details:");
		c1.PaymentDetails();
		System.out.println("Cash 2 details:");
		c2.PaymentDetails();
		System.out.println("Credit 1 details:");
		cc1.PaymentDetails();
		System.out.println("Credit 2 details:");
		cc2.PaymentDetails();
	}

}

class Payment {
	double amount;

	Payment() {
		amount = 0.0;
	}

	Payment(double amount) {
		this.amount = amount;
	}

	public void setPayment(double amount) {
		this.amount = amount;
	}

	public double getPayment() {
		return amount;
	}

	public void PaymentDetails() {
		System.out.println("The payment amount is " + amount);
	}
}

class CashPayment extends Payment {
	public CashPayment(double amount) {
		super(amount);
	}

	public void PaymentDetails() {
		System.out.println("The payment cash amount is " + this.getPayment());
	}
}

class CreditCardPayment extends Payment {
	String name;
	String date;
	String cardnumber;

	public CreditCardPayment(double amount, String name, String date, String cardnumber) {
		super(amount);
		this.name = name;
		this.date = date;
		this.cardnumber = cardnumber;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public void PaymentDetails() {
		System.out.println("The payment amount from card number " + cardnumber + " with expiration date of " + date+ " by " + name + " is " + this.getPayment());
	}
}
