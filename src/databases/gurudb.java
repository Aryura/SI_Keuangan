/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databases;

import java.sql.*;

/**
 *
 * @author maula
 */
public class gurudb {

    db db = new db();

    public ResultSet tabelguru() throws SQLException {
        String sql = "select * from guru";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement createGuru(String n, String notlp, String al) throws SQLException {
        String sql = "insert into guru (nama_guru,no_telepon,alamat) values (?,?,?)";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, n);
        p.setString(2, notlp);
        p.setString(3, al);
        p.executeUpdate();
        return p;
    }

    public ResultSet checkGuru(String nama) throws SQLException {
        String sql = "select * from guru where id= '" + nama + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public ResultSet guruId() throws SQLException {
        String sql = "SELECT id FROM guru ORDER BY id DESC LIMIT 1";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public PreparedStatement updateGuru(String n, String notlp, String al, int id) throws SQLException {
        String sql = "update guru set nama_guru=?, no_telepon=?, alamat=? where id='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, n);
        p.setString(2, notlp);
        p.setString(3, al);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement deleteGuru(int id) throws SQLException {
        String sql = "delete from guru where id ='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }

    public ResultSet searchGuru(String cari) throws SQLException {
        String sql = "select * from guru where nama_guru like '%" + cari + "%'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
}
