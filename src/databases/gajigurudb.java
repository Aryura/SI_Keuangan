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
public class gajigurudb {
    db db = new db();
    public ResultSet tabelGajiGuru() throws SQLException {
        String sql = "select * from gajiguru";
        Statement p = db.connection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public PreparedStatement createGajiGuru(int idguru,String nguru,String tgl,int jampel,double gajijam,double tun,String kettun,double total) throws SQLException {
        String sql = "insert into gajiguru (id_guru,nama_guru,tanggal,jam_pelajaran,gaji_jam,tunjangan,ket_tunjangan,total) values (?,?,?,?,?,?,?,?);";
        sql += "update gajiguru set costumID = concat('GG00',id);";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setInt(1, idguru);
        p.setString(2, nguru);
        p.setString(3, tgl);
        p.setInt(4, jampel);
        p.setDouble(5, gajijam);
        p.setDouble(6, tun);
        p.setString(7, kettun);
        p.setDouble(8, total);
        p.executeUpdate();
        return p;
    }
    public PreparedStatement updateGajiGuru(String tgl,int jampel,double gajijam,double tun,String kettun,double total,String wnguru) throws SQLException {
        String sql = "update gajiguru set tanggal=?,jam_pelajaran=?,gaji_jam=?,tunjangan=?,ket_tunjangan=?,total=? where nama_guru='" + wnguru + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, tgl);
        p.setInt(2, jampel);
        p.setDouble(3, gajijam);
        p.setDouble(4, tun);
        p.setString(5, kettun);
        p.setDouble(6, total);
        p.executeUpdate();
        return p;
    }
    public PreparedStatement deleteGajiGuru(String id) throws SQLException {
        String sql = "delete from gajiguru where costumID='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }
    public ResultSet checkGajiGuru(String nama) throws SQLException {
        String sql = "select * from gajiguru where (nama_guru= '" + nama + "')";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public ResultSet getdataguru(String nama) throws SQLException {
        String sql = "select * from infopembayaran where pembayaran= '" + nama + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public ResultSet GajiGuruId() throws SQLException {
        String sql = "SELECT id FROM gajiguru ORDER BY id DESC LIMIT 1";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
    public ResultSet resetid() throws SQLException {
        String sql = "SELECT * from gajiguru ORDER BY id;";
        sql += "SET @count = 0;";
        sql += "UPDATE gajiguru  SET id = @count:= @count + 1;";
        sql += "update gajiguru set costumID = concat('GG00',id);";
        sql += "ALTER TABLE gajiguru AUTO_INCREMENT = 1;";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
    public ResultSet searchGajiGuru(String cari) throws SQLException {
        String sql = "select * from gajiguru where nama_guru like '%" + cari + "%'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
}
