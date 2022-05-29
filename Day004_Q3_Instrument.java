abstract class Day004_Q3_Instrument {
    abstract void Play();
    
}

 class Piano_D4Q3 extends Day004_Q3_Instrument{
    void Play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
 class Flute_D4Q3 extends Day004_Q3_Instrument{
    void Play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
 class Guitar_D4Q3 extends Day004_Q3_Instrument{
    void Play() {
        System.out.println("Guitar is playing tin tin tin ");
    }
}