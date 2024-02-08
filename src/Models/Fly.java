package Models;

import java.time.LocalDate;

public class Fly {
    private String afgang;
    private String destination;
    private LocalDate afgangsTidspunkt;
    private LocalDate ankomstsTidspunkt;
    private String flySelskab;

    public Fly(String afgang, String destination, LocalDate afgangsTidspunkt, LocalDate ankomstsTidspunkt, String flySelskab) {
        this.afgang = afgang;
        this.destination = destination;
        this.afgangsTidspunkt = afgangsTidspunkt;
        this.ankomstsTidspunkt = ankomstsTidspunkt;
        this.flySelskab = flySelskab;
    }
}
