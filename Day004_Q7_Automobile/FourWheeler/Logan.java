package Day004_Q7_Automobile.FourWheeler;

import Day004_Q6_Automobile.Vehicle;

public class Logan extends Vehicle{

    String modelname;
    String registrationnumber;
    String ownername;
    int speed;
    int gps;

    public Logan(String modelname, String registrationnumber, String ownername, int speed, int gps) {
        this.modelname = modelname;
        this.registrationnumber = registrationnumber;
        this.ownername = ownername;
        this.speed = speed;
        this.gps = gps;
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

    public int gps() {
        return gps;
    }
}
