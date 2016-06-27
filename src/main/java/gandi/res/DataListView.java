package gandi.res;

import gandi.model.EarthQuake;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class DataListView implements Serializable {

    private List<EarthQuake> cars1;

    private EarthQuake selectedCar;

    @PostConstruct
    public void init() throws FileNotFoundException {
        cars1 = CSVSerialEQ.zwroc();
    }

    public List<EarthQuake> getCars1() {
        return cars1;
    }

    public EarthQuake getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(EarthQuake selectedCar) {
        this.selectedCar = selectedCar;
    }
}