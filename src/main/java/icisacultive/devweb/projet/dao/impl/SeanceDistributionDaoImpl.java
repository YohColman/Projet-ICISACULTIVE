package icisacultive.devweb.projet.dao.impl;

import icisacultive.devweb.projet.dao.SeanceDistributionDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class SeanceDistributionDaoImpl implements SeanceDistributionDao {
    @Override
    public void ajouterSeanceDistrib(String date) {
        String query = "INSERT INTO seancedistribution(dateseance) VALUES(?)";
        try (Connection connection = DataSourceProvider.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, date);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
