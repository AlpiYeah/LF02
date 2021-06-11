package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.sql.*;

public class VertragspartnerDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragDAO/Kaufvertrag.db3";

    public VertragspartnerDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    /**
     * Sie liest ein Vertragspartner auf basis seiner Ausweisnr
     *
     * @param AusweisNr
     * @return der gewunschte datensatz
     */
    public Vertragspartner read(String AusweisNr) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Vertragspartner vertragspartner = null;
        // Verbindung zur Datebank erstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            // SQL Anfrage erstellen
            String sql = "SELECT * FROM Vertragspartner WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, AusweisNr);
            // SQL Anfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            // Zeiger auf den ersten Datensatz setzen
            resultSet.next();
            // ResultSet auswerten (VGL: Ergebnistabelle)
            String nr = resultSet.getString("AusweisNr");
            String vorname = resultSet.getString("Vorname");
            String nachname = resultSet.getString("Nachname");
            String strasse = resultSet.getString("Strasse");
            String hausNr = resultSet.getString("HausNr");
            String plz = resultSet.getString("PLZ");
            String ort = resultSet.getString("Ort");
            // Vertragsparterobject erstellen
            vertragspartner = new Vertragspartner(vorname, nachname);
            vertragspartner.setAusweisNr(AusweisNr);
            Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
            vertragspartner.setAdresse(adresse);
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
            return vertragspartner;
        }
    }
}