package icisacultive.devweb.projet.entities;

import java.util.Date;

public class SeanceDistribution {
    private Date dateSeance;

    public SeanceDistribution(Date date){
        this.dateSeance=date;
    }

    public Date getDateSeance() {
        return dateSeance;
    }

    public void setDateSeance(Date dateSeance) {
        this.dateSeance = dateSeance;
    }
}
