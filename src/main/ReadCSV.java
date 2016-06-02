package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadCVS {

    public static void main (String[] args) {

        ReadCVS obj = new ReadCVS();
        obj.run();
    }

            public void run() {

                String csvFile = "C:/kk.csv";
                BufferedReader br = null;
                String line = "";
                String cvsSplitBy = ";";

                try {

                    br = new BufferedReader(new FileReader(csvFile));
                    while ((line = br.readLine()) != null) {

                        // use comma as separator
                        String[] value = line.split(cvsSplitBy);

                        System.out.println(value[0] + ";" + value[1]);

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

                System.out.println("Done");
            }

}
