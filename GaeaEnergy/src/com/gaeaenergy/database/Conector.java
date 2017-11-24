/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaeaenergy.database;

import com.gaeaenergy.stream.WriteToFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author comp8
 */
public class Conector {

    private static final String driver_db = "org.hsqldb.jdbcDriver";
    private static final String url = "jdbc:hsqldb:hsql://localhost/gaeadb";
    private static final String db_user = "sa";
    private static final String db_password = "";

    public static Connection/**/ getConnection() throws ClassNotFoundException {
        Connection connection = null;

        Class.forName(driver_db);
        try {
            connection = DriverManager.getConnection(url, db_user, db_password);
        } catch (SQLException ex) {
            WriteToFile log = new WriteToFile();
            log.jogaPilhaNoArquivo(ex, true);
        }
        return connection;
    }

    public boolean testaConexao() throws ClassNotFoundException {
        Connection connection = null;

        Class.forName(driver_db);
        try {
            connection = DriverManager.getConnection(url, db_user, db_password);
            return true;
        } catch (SQLException ex) {
            WriteToFile log = new WriteToFile();
            log.jogaPilhaNoArquivo(ex, true);
            return false;
        }
    }
}
