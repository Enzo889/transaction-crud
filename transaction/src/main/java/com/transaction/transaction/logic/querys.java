/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.transaction.transaction.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author enzo
 */
public class querys {
    public void loadDataFromDatabase(JComboBox comboIdUser, JComboBox comboIdUserCreate, JComboBox comboIdUserUpdate, JComboBox comboIdForm, JComboBox comboIdModule) {
    
    String username = "ies9021_userdb";
    String password = "Xsw23edc.127";
    String database = "ies9021_coco";
    String ip = "ies9021.edu.ar";
    String port = "3306";

    // Agregamos parámetros adicionales en la cadena de conexión
    String connectionString = "jdbc:mysql://" + ip + ":" + port + "/" + database + "?useSSL=false&serverTimezone=UTC";

    
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Conectar a la base de datos
            conn = DriverManager.getConnection(connectionString, username, password);

            // Consulta SQL para obtener los tipos de transacción
            String query = "SELECT id_user, name, last_name FROM ies9021_coco.user;";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            comboIdUser.removeAllItems();
            comboIdUserCreate.removeAllItems();
            comboIdUserUpdate.removeAllItems();

            // Agregar resultados al ComboBox
            while (rs.next()) {
                String fullName = rs.getString("last_name") + ", " + rs.getString("name");
                int IdUser = rs.getInt("id_user");
                
                comboIdUser.addItem(fullName);
                comboIdUser.putClientProperty(fullName, IdUser);
                comboIdUserCreate.addItem(fullName);
                comboIdUserCreate.putClientProperty(fullName, IdUser);
                comboIdUserUpdate.addItem(fullName);
                comboIdUserUpdate.putClientProperty(fullName, IdUser);
            }
            
            // Close ResultSet and PreparedStatement for the first query
        rs.close();
        ps.close();

        // Second SQL query for module data
        String formsQuery = "SELECT id_forms, name FROM ies9021_coco.forms;"; // Adjust table and column names as needed
        ps = conn.prepareStatement(formsQuery);
        rs = ps.executeQuery();

        // Clear existing items in the module ComboBox
        comboIdForm.removeAllItems();

        // Add module results to ComboBox
        while (rs.next()) {
            comboIdForm.addItem(rs.getString("name")); // Adjust based on your actual column name
            int IdForm =  rs.getInt("id_forms");
            
            comboIdForm.putClientProperty(rs.getString("name"), IdForm);
        
        }
        
           // Consulta SQL para obtener los tipos de transacción
            String moduleQuery = "SELECT name_module FROM ies9021_coco.module;";
            ps = conn.prepareStatement(moduleQuery);
            rs = ps.executeQuery();

            comboIdModule.removeAllItems();

            // Agregar resultados al ComboBox
            while (rs.next()) {
                String nameModule = rs.getString("name_module");
                
                comboIdModule.addItem(nameModule);
               
            }
            
            // Close ResultSet and PreparedStatement for the first query
        rs.close();
        ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y recursos
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
