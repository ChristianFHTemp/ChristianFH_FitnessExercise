package dk.kea.dat19c;

public class DVD extends Machine {

    @Override
    public String toString() {
        if (isOn){
            return "Spiller vi kan li' polimorfi!";
        }
        else {
            return "Tid for overloading";
        }
    }
}
