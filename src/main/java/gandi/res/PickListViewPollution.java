package gandi.res;

import gandi.model.Pollution;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gandi on 27.06.2016.
 */

@ManagedBean

public class PickListViewPollution {

        @ManagedProperty("#{themeService}")

        private DualListModel<String> cities;

        @PostConstruct
        public void init() {
            //Cities
            List<String> citiesSource = new ArrayList<String>();
            List<String> citiesTarget = new ArrayList<String>();

            citiesSource.add("Data");
            citiesSource.add("PM10");
            citiesSource.add("PM25");
            citiesSource.add("Bap");

            cities = new DualListModel<String>(citiesSource, citiesTarget);

        }

        public DualListModel<String> getCities() {
            return cities;
        }

        public void setCities(DualListModel<String> cities) {
            this.cities = cities;
        }

        public void onTransfer(TransferEvent event) {
            StringBuilder builder = new StringBuilder();
            for(Object item : event.getItems()) {
                builder.append(((Pollution) item).getPM10()).append("<br />");
            }

            FacesMessage msg = new FacesMessage();
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            msg.setSummary("Items Transferred");
            msg.setDetail(builder.toString());

            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

        public void onSelect(SelectEvent event) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", event.getObject().toString()));
        }

        public void onUnselect(UnselectEvent event) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
        }

        public void onReorder() {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "List Reordered", null));
        }

}
