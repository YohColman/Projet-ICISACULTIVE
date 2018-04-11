package icisacultive.devweb.projet.dao;

import java.util.List;

public interface LigneDeCommandeDao {
    public List<LigneDeCommandeDao> listLigneDeCommande();

    public LigneDeCommandeDao getLigneDeCommande(Integer id);
}
