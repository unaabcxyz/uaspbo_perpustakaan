/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dwi.aulia.anugerah_202102359_uas_perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class koneksi_2 {
    Connection con;
    public Connection getConnection(){
        try {
              con = DriverManager.getConnection("jdbc:mysql://dwiauliaa/db_perpustakaan","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL \n"+e);
        }
        return con;
    }
    
}
