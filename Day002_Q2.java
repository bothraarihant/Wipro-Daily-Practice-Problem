public class Day002_Q2 {
    public static void main(String[] args) {
        Vehicle_D2Q2 v1 = new Vehicle_D2Q2(345678, "Lambo", 200000, 40);
        Vehicle_D2Q2 v2 = new Vehicle_D2Q2(341228, "Tata", 40000, 30);

        System.out.println("The Details of the car with lowest price is:");
        if (v1.getPrice() < v2.getPrice()) {
            v1.Display();
            ;

        } else {
            v2.Display();
        }
        System.out.println("The Details of the car with best milage is:");
        if (v1.milage < v2.milage) {
            v2.Display();
        } else {
            v1.Display();
        }
    }
}

class Vehicle_D2Q2 {
    int regnumber;
    String brand;
    int price;
    int milage;

    Vehicle_D2Q2(int regnumber, String brand, int price, int milage) {
        this.regnumber = regnumber;
        this.brand = brand;
        this.price = price;
        this.milage = milage;
    }

    void Display() {
        System.out.println("Registration number: " + regnumber);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Milage: " + milage);
    }

    public int getPrice() {
        return price;
    }
}