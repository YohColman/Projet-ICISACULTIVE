package icisacultive.devweb.projet.dao;

import icisacultive.devweb.projet.entities.Utilisateur;

import java.util.List;

public interface UtilisateurDao {

    List<Utilisateur> listerUtilisateurs();

    Utilisateur getUtilisateur(Long id);

    Utilisateur getUtilisateur(String mail);

    String getMotDePasseUtilisateur(String identifiant);


}
