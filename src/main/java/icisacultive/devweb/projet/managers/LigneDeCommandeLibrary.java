package icisacultive.devweb.projet.managers;

import icisacultive.devweb.projet.dao.LigneDeCommandeDao;
import icisacultive.devweb.projet.dao.impl.LigneDeCommandeDaoImpl;

public class LigneDeCommandeLibrary {

    private static class LigneDeCommandeLibraryHolder {
        private final static LigneDeCommandeLibrary instance = new LigneDeCommandeLibrary();
    }

    public static LigneDeCommandeLibrary getInstance(){return LigneDeCommandeLibraryHolder.instance;}

    private LigneDeCommandeDao ligneDeCommandeDao = new LigneDeCommandeDaoImpl();

    private LigneDeCommandeLibrary(){

    }

    public Integer getNombreDePaniersCommande(Integer idCommande){return this.ligneDeCommandeDao.getNombreDePanierCommande(idCommande);}

    public void ajouterLigneDeCommande(Integer idCommande){this.ligneDeCommandeDao.ajouterLigneDeCommande(idCommande);}
}
