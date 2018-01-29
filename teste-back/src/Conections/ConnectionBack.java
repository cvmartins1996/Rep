/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author felipe
 */
public class ConnectionBack {

    public static Connection conn = null;

    public static Connection conectarBdBack() throws SQLException {
        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/back?" + "user=root&password=felipe@mota#1991");
                conn.setAutoCommit(false);
                System.out.println("Conexao com o banco back ok!");
                return conn;
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println("Erro na Conexão: ");
            System.out.println("Causa : " + exception.getCause());
            conn.rollback();
        }
        return conn;
    }

    public void TestConnection() throws SQLException {
        Connection conn = ConnectionBack.conectarBdBack();
        if (conn == null) {
            System.out.println("Conexão fail! = " + conn);
        } else {
            System.out.println("Conexão ok! = " + conn);
        }
    }

    public static void main(String args[]) throws SQLException {
        ConnectionBack conn = new ConnectionBack();
        conn.TestConnection();
    }
}
