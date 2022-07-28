/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;
import java.sql.*;
/**
 *
 * @author maula
 */
public class detaildb {
    db db = new db();
    public ResultSet tabel() throws SQLException {
        String sql = "select * from detai_pem";
        Statement p = db.connection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public PreparedStatement update(int bulan,String nisn) throws SQLException {
        String sql = "update detai_pem set bulan=? where NISN='" + nisn + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nisn);
        p.executeUpdate();
        return p;
    }
    public PreparedStatement create(int nisn, String n, String jp, int bulan, int nom, String tgl,String kelas,String ket,String id) throws SQLException {
        String sql = "insert into detai_pem (NISN,nama_siswa,jenis_pembayaran,bulan,nominal,tanggal,kelas,keterangan,costumID) values (?,?,?,?,?,?,?,?,?);";
//        sql += "update detai_pem set customID = concat('TRX00',id);";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setInt(1, nisn);
        p.setString(2, n);
        p.setString(3, jp);
        p.setInt(4, bulan);
        p.setInt(5, nom);
        p.setString(6, tgl);
        p.setString(7, kelas);
        p.setString(8, ket);
        p.setString(9, id);
        p.executeUpdate();
        return p;
    }
    public ResultSet check(String nama, String jp,String ket) throws SQLException {
        String sql = "select * from detai_pem where (nama_siswa= '" + nama + "' and jenis_pembayaran= '" + jp + "' and keterangan)";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public ResultSet pemId() throws SQLException {
        String sql = "SELECT id FROM detai_pem ORDER BY id DESC LIMIT 1";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
    public PreparedStatement deletepem(int id) throws SQLException {
        String sql = "delete from detai_pem where NISN='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }
}
