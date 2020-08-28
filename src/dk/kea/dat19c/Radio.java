package dk.kea.dat19c;

public class Radio extends Machine {


    @Override
    public String toString() {

        //afhænger af om tændt
        if (isOn) {
            return "Spiller Nomi Nomi (hardcore)";
        }
        else{
            return "Tager hjem for at høre Amon Amarth";
        }

    }
}
