package gandi.res;

import gandi.model.EarthQuake;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gandi on 26.06.2016.
 */
public class CSVSerialEQ {

    public static List<EarthQuake> zwroc() throws FileNotFoundException {
        List<EarthQuake> list = new ArrayList<EarthQuake>();

        String csvFile = "C:/pl/query.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] value = line.split(cvsSplitBy);

                EarthQuake personObj = new EarthQuake();

                // add values from csv to car object
                personObj.setData(value[0]);
                personObj.setDepth(value[3]);
                personObj.setLongitude(value[2]);
                personObj.setPlace(value[13]);
                personObj.setLatitude(value[1]);
                personObj.setMagnitude(value[4]);

                // adding car objects to a list
                list.add(personObj);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
