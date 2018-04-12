package icisacultive.devweb.projet.managers;

import icisacultive.devweb.projet.dao.LigneDeCommandeDao;
import icisacultive.devweb.projet.dao.impl.LigneDeCommandeDaoImpl;
import icisacultive.devweb.projet.entities.LigneDeCommande;

import java.util.List;

public class LigneDeCommandeLibrary {

    private static class LigneDeCommandeLibraryHolder {
        private final static LigneDeCommandeLibrary instance = new LigneDeCommandeLibrary();
    }

    public static LigneDeCommandeLibrary getInstance(){return LigneDeCommandeLibraryHolder.instance;}

    private LigneDeCommandeDao ligneDeCommandeDao = new LigneDeCommandeDaoImpl();

    private LigneDeCommandeLibrary(){

    }

    public List<LigneDeCommande> listLigneDeCommandeByCommandeByUser(Integer idCommande){return this.ligneDeCommandeDao.listLigneDeCommandeByUser(idCommande);}

    public Integer getNombreDePaniersCommande(Integer idCommande){return this.ligneDeCommandeDao.getNombreDePanierCommande(idCommande);}

    public void ajouterLigneDeCommande(Integer idCommande){this.ligneDeCommandeDao.ajouterLigneDeCommande(idCommande);}
}
