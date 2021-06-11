package dao;

import businessObjects.Ware;

import java.sql.*;

public class WareDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragDAO/Kaufvertrag.db3";

    public WareDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }
    public Ware read(String WarenNr) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Ware ware = null;
        // Verbindung zur Datebank erstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            // SQL Anfrage erstellen
            String sql = "SELECT * FROM Ware WHERE WarenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, WarenNr);
            // SQL Anfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            // Zeiger auf den ersten Datensatz setzen
            resultSet.next();
            // ResultSet auswerten (VGL: Ergebnistabelle)
            String nr = resultSet.getString("WarenNr");
            String bezeichnung = resultSet.getString("Bezeichnung");
            String beschreibung = resultSet.getString("Beschreibung");
            double preis = resultSet.getDouble("Preis");
            String[] besonderheiten = resultSet.getString("Besonderheiten").split(";");
            String[] maengel = resultSet.getString("Maengel").split(";");
            // Wareobject erstellen
            ware = new Ware(WarenNr,bezeichnung,preis);
            ware.setWarenNr(nr);
            ware.setBeschreibung(beschreibung);
            if (maengel != null) {
                for (String mangel : maengel) {
                    ware.getMaengelListe().add(mangel);
                }
            }
            if (besonderheiten != null)
                for (String besonderheit : besonderheiten) {
                    ware.getBesonderheitenListe().add(besonderheit);
                }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {

                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return ware;
        }
    }
}