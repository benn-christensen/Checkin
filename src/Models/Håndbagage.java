package Models;

public class Håndbagage extends Bagage {

    private double højde;
    private double brede;
    private double dybde;
    public Håndbagage(double vægt, double højde, double brede, double dybde) {
        super(vægt);
        this.højde = højde;
        this.brede = brede;
        this.dybde = dybde;
    }
}
