package icisacultive.devweb.projet.managers;

import icisacultive.devweb.projet.dao.UtilisateurDao;
import icisacultive.devweb.projet.dao.impl.UtilisateurDaoImpl;
import icisacultive.devweb.projet.entities.Utilisateur;

import java.util.List;

public class UtilisateurLibrary {
    private static class UtilisateurLibraryHolder {
        private static UtilisateurLibrary instance = new UtilisateurLibrary();
    }

    public static UtilisateurLibrary getInstance(){ return UtilisateurLibraryHolder.instance; }

    private UtilisateurLibrary(){

    }

    private UtilisateurDao utilisateurDao = new UtilisateurDaoImpl();

    public List<Utilisateur> listerUtilisateurs() {
        return utilisateurDao.listerUtilisateurs();
    }

    public Utilisateur getUtilisateur(String email) {
        if (email == null || "".equals(email)) {
            throw new IllegalArgumentException("L'identifiant doit être renseigné.");
        }
        return utilisateurDao.getUtilisateur(email);
    }

    public boolean validerMotDePasse(String email, String motDePasseAVerifier){
        boolean verif = false;
        if (email == null || "".equals(email)) {
            throw new IllegalArgumentException("L'identifiant doit être renseigné.");
        }
        if (motDePasseAVerifier == null || "".equals(motDePasseAVerifier)) {
            throw new IllegalArgumentException("Le mot de passe doit être renseigné.");
        }
        String motDePasse = utilisateurDao.getMotDePasseUtilisateur(email);
        if (motDePasse == null) {
            throw new IllegalArgumentException("L'identifiant n'est pas connu.");
        }
        if (motDePasse.equals(motDePasseAVerifier)){
            verif=true;
        }
        System.out.println("Verification de la validation du mot de passe : "+verif);
        return verif;
    }


}
