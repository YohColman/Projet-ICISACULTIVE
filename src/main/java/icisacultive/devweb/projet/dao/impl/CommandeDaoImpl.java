package icisacultive.devweb.projet.dao.impl;


import icisacultive.devweb.projet.dao.CommandeDao;
import icisacultive.devweb.projet.entities.Commande;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommandeDaoImpl implements CommandeDao{

    @Override
    public List<Commande> listCommandes() {

        String query = "SELECT commande.idcommande, commande.montant, commande.paye, commande.date, utilisateur.nom, utilisateur.prenom FROM commande INNER JOIN utilisateur ON commande.idutilisateur = utilisateur.idutilisateur ";
        List<Commande> listOfCommandes = new ArrayList<>();
        try (
                Connection connection = DataSourceProvider.getDataSource().getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
        ) {
            while (resultSet.next()) {
                listOfCommandes.add(new Commande(resultSet.getInt("idcommande"), resultSet.getInt("montant"), resultSet.getInt("paye"), resultSet.getString("nom"), resultSet.getString("prenom")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfCommandes;

    }

    @Override
    public void paymentDone(Integer idCommande) {

        String query = "UPDATE commande SET paye='1' WHERE idcommande=?;";
        try {
            Connection connection = DataSourceProvider.getDataSource().getConnection();
            java.sql.PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, idCommande);
            ResultSet resultSet = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
