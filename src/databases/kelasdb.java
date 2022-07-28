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
public class kelasdb {

    db db = new db();

    public ResultSet tabelKelas() throws SQLException {
        String sql = "SELECT *, COUNT(nama_kelas)AS jumlah_murid FROM murid INNER JOIN kelas on kelas.nama_kelas=murid.Kelas GROUP BY kelas.wali_kelas";
        Statement p = db.connection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement createKelas(String nkelas, String wkelas) throws SQLException {
        String sql = "insert into kelas (nama_kelas,wali_kelas) values (?,?);";
        sql += "update kelas set customID = concat('KLS00',id);";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nkelas);
        p.setString(2, wkelas);
        p.executeUpdate();
        return p;
    }

    public ResultSet kelasId() throws SQLException {
        String sql = "SELECT id FROM kelas ORDER BY id DESC LIMIT 1";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public ResultSet checkKelas(String nama) throws SQLException {
        String sql = "select * from kelas where nama_kelas= '" + nama + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement updateKelas(String nkelas, String wkelas, String id) throws SQLException {
        String sql = "update kelas set nama_kelas=?, wali_kelas=? where customID='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nkelas);
        p.setString(2, wkelas);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement deleteKelas(String id) throws SQLException {
        String sql = "delete from kelas where customID ='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }

    public ResultSet showGuru() throws SQLException {
        String sql = "SELECT nama_guru FROM guru ORDER BY nama_guru asc";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
    public ResultSet searchKelas(String cari) throws SQLException {
        String sql = "select * from kelas where nama_kelas like '%" + cari + "%'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r; 
    }
    public ResultSet resetid() throws SQLException {
        String sql = "SELECT * from kelas ORDER BY id;";
        sql += "SET @count = 0;";
        sql += "UPDATE kelas  SET id = @count:= @count + 1;";
        sql += "update kelas set customID = concat('KLS00',id);";
        sql += "ALTER TABLE kelas AUTO_INCREMENT = 1;";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
}
