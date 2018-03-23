package icisacultive.devweb.projet.entities;

import java.util.Date;

public class LigneDeCommande {

    private Integer idLigneDeCommande;
    private Integer receptionne;
    private Integer idCommande;
    private Date date;

    public LigneDeCommande(Integer idLigneDeCommande, Integer receptionne, Integer idCommande, Date date) {
        this.idLigneDeCommande = idLigneDeCommande;
        this.receptionne = receptionne;
        this.idCommande = idCommande;
        this.date = date;
    }

    public Integer getIdLigneDeCommande() {
        return idLigneDeCommande;
    }

    public void setIdLigneDeCommande(Integer idLigneDeCommande) {
        this.idLigneDeCommande = idLigneDeCommande;
    }

    public Integer getReceptionne() {
        return receptionne;
    }

    public void setReceptionne(Integer receptionne) {
        this.receptionne = receptionne;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
