package Day004_Q7_Automobile.TwoWheeler;

import Day004_Q6_Automobile.*;

public class Honda extends Vehicle {

    
    String modelname;
    String registrationnumber;
    String ownername;
    int speed;
    int cdplayer;

    public Honda(String modelname, String registrationnumber, String ownername, int speed, int cdplayer) {
        this.modelname = modelname;
        this.registrationnumber = registrationnumber;
        this.ownername = ownername;
        this.speed = speed;
        this.cdplayer = cdplayer;
    }

    public String modelName() {
        return modelname;
    }

    public String registrationNumber() {
        return registrationnumber;
    }

    public String ownerName() {
        return ownername;
    }

    public int Speed() {
        return speed;
    }

    public int Cdplayer() {
        return cdplayer;
    }

}
