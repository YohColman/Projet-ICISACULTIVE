package icisacultive.devweb.projet.dao;

import icisacultive.devweb.projet.entities.LigneDeCommande;

import java.util.List;

public interface LigneDeCommandeDao {
    public List<LigneDeCommande> listLigneDeCommande();

    public LigneDeCommandeDao getLigneDeCommande(Integer id);
}
