import Day004_Q6_Automobile.TwoWheeler.*;

public class Day004_Q6 {
    public static void main(String[] args) {
        Hero hero = new Hero("Model 1", "132423", "Rajesh", 120);
        Honda honda = new Honda("Model X", "1187623", "Raghav", 140, 1);
        System.out.println(hero.modelName());
        System.out.println(hero.registrationNumber());
        System.out.println(hero.ownerName());
        System.out.println(hero.Speed());
        System.out.println("\n");
        System.out.println(honda.modelName());
        System.out.println(honda.registrationNumber());
        System.out.println(honda.ownerName());
        System.out.println(honda.Speed());
        System.out.println(honda.Cdplayer());
    }
}
