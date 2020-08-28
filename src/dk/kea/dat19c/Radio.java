package dk.kea.dat19c;

public class Radio extends Machine {

    public void news(){
        System.out.println("Nummi Nummi skal nu staves som Nomi Nomi");
    }

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
