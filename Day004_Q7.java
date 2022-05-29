import Day004_Q7_Automobile.FourWheeler.*;;
public class Day004_Q7 {
    public static void main(String[] args) {
        Logan logan = new Logan("Model 1", "132423", "Rajesh", 120, 2);
        Ford ford = new Ford("Model X", "1187623", "Raghav", 140, 1);
        System.out.println(logan.modelName());
        System.out.println(logan.registrationNumber());
        System.out.println(logan.ownerName());
        System.out.println(logan.Speed());
        System.out.println(logan.gps());
        System.out.println("\n");
        System.out.println(ford.modelName());
        System.out.println(ford.registrationNumber());
        System.out.println(ford.ownerName());
        System.out.println(ford.Speed());
        System.out.println(ford.tempcontrol());
    }
}
