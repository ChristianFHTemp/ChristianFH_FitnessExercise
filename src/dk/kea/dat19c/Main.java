package dk.kea.dat19c;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    /*
	    // først en maskine

        Machine m = new Machine();
        System.out.println(m);
        m.turnOn();
        System.out.println(m);

        // så en radio
        m = new Radio();
        System.out.println(m);
        m.turnOn();
        System.out.println(m);

        // så en dvd-spiller
        m = new DVD();
        System.out.println(m);
        m.turnOn();
        System.out.println(m);
        */

        //opret arraylist med apparater
        List<Machine> machines =new ArrayList<>();
        machines.add(new Machine());
        machines.add(new Radio());
        machines.add(new DVD());

        //loop igennem og udskriv
        for (Machine ma: machines){
            ma.turnOn();
            System.out.println(ma);
        }

    }
}
