package dk.kea.dat19c;

public class Main {

    public static void main(String[] args) {
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


    }
}
