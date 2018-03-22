package icisacultive.devweb.projet.managers;

import icisacultive.devweb.projet.dao.CommandeDao;
import icisacultive.devweb.projet.dao.impl.CommandeDaoImpl;
import icisacultive.devweb.projet.entities.Commande;

import java.util.List;

public class CommandeLibrary {

    private static class CommandeLibraryHolder {
        private final static CommandeLibrary instance = new CommandeLibrary();
    }

    public static CommandeLibrary getInstance(){return CommandeLibraryHolder.instance;}

    private CommandeDao commandeDao = new CommandeDaoImpl();

    private CommandeLibrary(){

    }

    public List<Commande> listCommandes(){return commandeDao.listCommandes();}
}
