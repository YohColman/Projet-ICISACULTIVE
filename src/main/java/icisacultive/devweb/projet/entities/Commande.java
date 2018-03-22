package icisacultive.devweb.projet.entities;

import java.util.Date;

public class Commande {
    private Integer id;
    private Integer montant;
    private String paye;
    private String nomClient;
    private String prenomClient;
    private Date date;


    public Commande(Integer id, Integer montant, Integer paye, String nom, String prenom) {
        this.id = id;
        this.montant = montant;
        if (paye==0) {
            this.paye = "Commande non réglée";
        }else if(paye==1){
            this.paye = "Commande réglée ";
        }
        this.nomClient = nom;
        this.prenomClient=prenom;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMontant() {
        return montant;
    }



    public String getPaye() {
        return paye;
    }

    public void setPaye(String paye) {
        this.paye = paye;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }


    public Date getDate() {
        return date;
    }


}
