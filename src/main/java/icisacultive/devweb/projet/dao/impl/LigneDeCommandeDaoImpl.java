package icisacultive.devweb.projet.dao.impl;

import icisacultive.devweb.projet.dao.LigneDeCommandeDao;
import icisacultive.devweb.projet.entities.LigneDeCommande;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LigneDeCommandeDaoImpl implements LigneDeCommandeDao {
    @Override
    public List<LigneDeCommande> listLigneDeCommande() {
        String query = "SELECT * FROM lignedecommande";
        List<LigneDeCommande> listOfLigneDeCommande = new ArrayList<>();
        try (
                Connection connection = DataSourceProvider.getDataSource().getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
        ) {
            while (resultSet.next()) {
                listOfLigneDeCommande.add(new LigneDeCommande(resultSet.getInt("idlignedecommande"), resultSet.getInt("receptionne"), resultSet.getInt("idcommande"), resultSet.getDate("date")) );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfLigneDeCommande;
    }

    @Override
    public LigneDeCommandeDao getLigneDeCommande(Integer id) {
        return null;
    }
}
