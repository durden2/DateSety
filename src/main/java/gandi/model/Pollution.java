package gandi.model;

import java.util.Date;

/**
 * Created by Gandi on 27.06.2016.
 */
public class Pollution {
    Date czas;
    int PM10;
    int PM25;
    float BaP;

    public Date getCzas() {
        return czas;
    }

    public void setCzas(Date czas) {
        this.czas = czas;
    }

    public int getPM10() {
        return PM10;
    }

    public void setPM10(int PM10) {
        this.PM10 = PM10;
    }

    public int getPM25() {
        return PM25;
    }

    public void setPM25(int PM25) {
        this.PM25 = PM25;
    }

    public float getBaP() {
        return BaP;
    }

    public void setBaP(float baP) {
        BaP = baP;
    }


}
