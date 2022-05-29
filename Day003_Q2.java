public class Day003_Q2 {
    public static void main(String[] args) {
        SportCar_D3Q2 sc = new SportCar_D3Q2();
        sc.Drive();
        sc.AirBallonType();
    }

}

class Car_D3Q2 {
    int speed;
    int noofgears;

    Car_D3Q2() {

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

class SportCar_D3Q2 extends Car_D3Q2 {
    SportCar_D3Q2() {

    }

    void AirBallonType() {
        super.Display();
        System.out.println("Special Feature: Air Ballons");
    }

}