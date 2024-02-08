package Models;

import java.util.ArrayList;

public class Rejse {
    private String Afgang;
    private String Destination;
    private ArrayList<Fly> rejseRute = new ArrayList<>();
    private Billet billet;
    private ArrayList<Bagage> checkedInBagage = new ArrayList<>();

    public Rejse(String afgang, String destination) {
        Afgang = afgang;
        Destination = destination;
    }

    public void købBillet(Billet billet) {
        this.billet = billet;
    }

    public void tilføjFly(Fly fly) {
        rejseRute.add(fly);
    }

    public void checkinBagage(Bagage bagage) {
        checkedInBagage.add(bagage);
    }
    public void udskrivRejseplan() {

    }
}
