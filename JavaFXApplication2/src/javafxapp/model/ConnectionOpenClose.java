package javafxapp.model;

import exceptions.ExceptionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionOpenClose {

    protected ResourceBundle configFile;
    protected String url;
    protected String user;
    protected String pass;
    protected Connection con;
    protected PreparedStatement stmt;

    public ConnectionOpenClose() {
        configFile = ResourceBundle.getBundle("javafxapp.model.Config");
        url = configFile.getString("URL");
        user = configFile.getString("USER");
        pass = configFile.getString("PASSWORD");
    }

    public Connection openConnection() throws ExceptionManager {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new ExceptionManager(e.getMessage());
        }
        return con;
    }

    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }

        if (con != null) {
            con.close();
        }

    }

}
