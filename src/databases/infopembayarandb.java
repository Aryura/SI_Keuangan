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
public class infopembayarandb {

    db db = new db();

    public ResultSet tabelpembayaran() throws SQLException {
        String sql = "select * from infopembayaran";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement createpembayaran(int kdpem, String pem, int nom) throws SQLException {
        String sql = "insert into infopembayaran (kd_pembayaran, pembayaran, nominal) values (?,?,?);";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setInt(1, kdpem);
        p.setString(2, pem);
        p.setInt(3, nom);
        p.executeUpdate();
        return p;
    }

    public ResultSet checkpembayaran(int kdpem) throws SQLException {
        String sql = "select * from infopembayaran where kd_pembayaran= '" + kdpem + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement updatepembayaran(String pem, int nom, int kdpem) throws SQLException {
        String sql = "update infopembayaran set pembayaran=? ,nominal=? where kd_pembayaran='" + kdpem + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, pem);
        p.setInt(2, nom);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement deletepembayaran(int kdpem) throws SQLException {
        String sql = "delete from infopembayaran where kd_pembayaran ='" + kdpem + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }

    public ResultSet searchpembayaran(String cari) throws SQLException {
        String sql = "select * from infopembayaran where kd_pembayaran like '%" + cari + "%'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

}
