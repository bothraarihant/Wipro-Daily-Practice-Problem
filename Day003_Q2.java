public class Day003_Q2 {
    public static void main(String[] args) {
        Car_D3Q2 c = new Car_D3Q2();
        c.drive();
        c.display();
    }
}

class Car_D3Q2 {
    int speed;
    int noofgear;

    void drive() {
        speed = 0;
        noofgear = 5;
    }

    void display() {
        System.out.println("The starting speed is " + speed);
        System.out.println("The total number of gears are "+ noofgear);
    }
}