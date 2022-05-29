package Day004_Q4_Live;

import Day004_Q4_Music.*;
import Day004_Q4_Music.string.*;
import Day004_Q4_Music.wind.*;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps;
        pv = new Veena();
        ps = new Saxophone();
        v.play();
        s.play();
        pv.play();
        ps.play();
    }
}
