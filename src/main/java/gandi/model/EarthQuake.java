package gandi.model;

import net.sf.jsefa.csv.annotation.CsvDataType;
import net.sf.jsefa.csv.annotation.CsvField;

/**
 * Created by Gandi on 26.06.2016.
 */

@CsvDataType()

public class EarthQuake {

    @CsvField(pos = 1)
    String data;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @CsvField(pos = 2)
    String latitude;

    @CsvField(pos = 3)
    String longitude;

    @CsvField(pos = 4)
    String depth;

    @CsvField(pos = 5)
    String magnitude;

    @CsvField(pos = 14)
    String place;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getData() {

        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
