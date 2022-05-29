package Day004_Q7_Automobile.TwoWheeler;

import Day004_Q6_Automobile.*;

public class Hero extends Vehicle {

    
    String modelname;
    String registrationnumber;
    String ownername;
    int speed;

    public Hero(String modelname, String registrationnumber, String ownername, int speed) {
        this.modelname = modelname;
        this.registrationnumber = registrationnumber;
        this.ownername = ownername;
        this.speed = speed;
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

    public void Radio() {
        
    }

}
