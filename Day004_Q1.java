public class Day004_Q1 {
    public static void main(String[] args) {
        SportCar_D4Q1 sc = new SportCar_D4Q1();
        sc.Drive();
        sc.AirBallonType();
    }

}

class Car_D4Q1 {
    int speed;
    int noofgears;

    Car_D4Q1() {

    }

    void Drive() {
        speed = 60;
        noofgears = 5;
    }

    void Display() {
        System.out.println("Speed: " + speed);
        System.out.println("No. of Gears: " + noofgears);
    }
}

class SportCar_D4Q1 extends Car_D4Q1 {
    SportCar_D4Q1() {

    }

    void AirBallonType() {
        super.Display();
        System.out.println("Special Feature: Air Ballons");
    }

}