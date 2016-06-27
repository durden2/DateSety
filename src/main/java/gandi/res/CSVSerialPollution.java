package gandi.res;

import gandi.model.Pollution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Gandi on 27.06.2016.
 */
public class CSVSerialPollution {


        public static List<Pollution> zwroc() throws FileNotFoundException {
            List<Pollution> list = new ArrayList<Pollution>();

            String csvFile = "C:/pl/daneBochnia.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";

            try {

                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] value = line.split(cvsSplitBy);

                    Pollution personObj = new Pollution();

                    // add values from csv to car object
                    DateFormat df = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
                    personObj.setCzas(df.parse(value[0]));
                    personObj.setPM10(Integer.parseInt(value[1]));
                    personObj.setPM25(Integer.parseInt(value[2]));
                    personObj.setBaP(Integer.parseInt(value[3]));

                    // adding car objects to a list
                    list.add(personObj);


                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
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
