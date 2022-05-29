package Day004_Q7_Automobile.FourWheeler;

import Day004_Q6_Automobile.Vehicle;

public class Ford extends Vehicle{

    String modelname;
    String registrationnumber;
    String ownername;
    int speed;
    int tempcontrol;

    public Ford(String modelname, String registrationnumber, String ownername, int speed, int tempcontrol) {
        this.modelname = modelname;
        this.registrationnumber = registrationnumber;
        this.ownername = ownername;
        this.speed = speed;
        this.tempcontrol = tempcontrol;
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

    public int tempcontrol() {
        return tempcontrol;
    }
}
