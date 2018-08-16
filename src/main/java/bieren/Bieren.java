package bieren;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bieren {

    private long bierNr;
    private String naam;
    private long brouwerNr;
    private long soortNr;
    private double alcohol;

    public Bieren() {
    }

    public Bieren(long bierNr, String naam, long brouwerNr, long soortNr, double alcohol) {
        this.bierNr = bierNr;
        this.naam = naam;
        this.brouwerNr = brouwerNr;
        this.soortNr = soortNr;
        this.alcohol = alcohol;
    }

    @Id
    public long getBierNr() {
        return bierNr;
    }

    public void setBierNr(long bierNr) {
        this.bierNr = bierNr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public long getBrouwerNr() {
        return brouwerNr;
    }

    public void setBrouwerNr(long brouwerNr) {
        this.brouwerNr = brouwerNr;
    }

    public long getSoortNr() {
        return soortNr;
    }

    public void setSoortNr(long soortNr) {
        this.soortNr = soortNr;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }
}
