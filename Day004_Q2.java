
public class Day004_Q2 {
	public static void main(String[] args) {
		CashPayment_D4Q2 c1 = new CashPayment_D4Q2(15000);
		CashPayment_D4Q2 c2 = new CashPayment_D4Q2(20000);
		CreditCardPayment_D4Q2 cc1 = new CreditCardPayment_D4Q2(25000, "Rajesh", "25/03/2022", "12345678");
		CreditCardPayment_D4Q2 cc2 = new CreditCardPayment_D4Q2(30000, "Jarvis", "09/05/2022", "87654321");
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

class Payment_D4Q2 {
	double amount;

	Payment_D4Q2() {
		amount = 0.0;
	}

	Payment_D4Q2(double amount) {
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

class CashPayment_D4Q2 extends Payment_D4Q2 {
	public CashPayment_D4Q2(double amount) {
		super(amount);
	}

	public void PaymentDetails() {
		System.out.println("The payment cash amount is " + this.getPayment());
	}
}

class CreditCardPayment_D4Q2 extends Payment_D4Q2 {
	String name;
	String date;
	String cardnumber;

	public CreditCardPayment_D4Q2(double amount, String name, String date, String cardnumber) {
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
