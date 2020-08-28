package dk.kea.dat19c;

public class Machine {

    //super class
    //field
    boolean isOn;

    //constructor
    public Machine(){
        isOn = false;
    }

    //tænd/sluk
    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "isOn=" + isOn +
                '}';
    }
}
