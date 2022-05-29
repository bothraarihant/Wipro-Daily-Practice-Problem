import java.util.*;
public class Day004_Q3 {
    public static void main(String[] args) {
        Day004_Q3_Instrument iarr[] = new Day004_Q3_Instrument[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt(3 - 0) + 1;
            if (randomNum == 1)
                iarr[i] = new Piano_D4Q3();
            else if (randomNum == 2)
                iarr[i] = new Flute_D4Q3();
            else if (randomNum == 3)
                iarr[i] = new Guitar_D4Q3();
            iarr[i].Play();
        }
        for (int i = 0; i < 10; i++) {
            if (iarr[i] instanceof Piano_D4Q3)
                System.out.println("Piano is stored at index " + i);
            else if (iarr[i] instanceof Flute_D4Q3)
                System.out.println("Flute is stored at index " + i);
            else if (iarr[i] instanceof Guitar_D4Q3)
                System.out.println("Guitar is stored at index " + i);
        }
    }
}
