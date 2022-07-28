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
public class pembayarandb {

    db db = new db();

    public ResultSet tabelpem() throws SQLException {
        String sql = "select * from pembayaran";
        Statement p = db.connection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public ResultSet tabelpem2() throws SQLException {
        String sql = "SELECT *,SUM(CASE WHEN jenis_pembayaran='SPP' THEN nominal END) AS SPP,SUM(CASE WHEN jenis_pembayaran='UTS' THEN nominal END) AS UTS ,SUM(CASE WHEN jenis_pembayaran='uas' THEN nominal END) AS UAS FROM `murid` INNER JOIN pembayaran on murid.Nama_SIswa=pembayaran.nama_siswa GROUP BY murid.Nama_SIswa;";
        Statement p = db.connection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public ResultSet tabelpemUTS() throws SQLException {
//        String sql = "SELECT nama_siswa,SUM(nominal) as uts FROM `pembayaran` WHERE jenis_pembayaran='UTS' GROUP BY nama_siswa";
        String sql = "SELECT pembayaran.costumID,murid.Nama_SIswa, SUM(pembayaran.nominal) AS uts FROM `pembayaran` INNER JOIN murid on pembayaran.nama_siswa=murid.Nama_SIswa WHERE pembayaran.jenis_pembayaran='uts' GROUP BY pembayaran.nama_siswa ;";

        Statement p = db.connection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public ResultSet tabelpemSPP() throws SQLException {
//        String sql = "SELECT nama_siswa,SUM(nominal) as spp FROM `pembayaran` WHERE jenis_pembayaran='SPP' GROUP BY nama_siswa";
        String sql = "SELECT pembayaran.costumID,murid.Nama_SIswa, SUM(pembayaran.nominal) AS spp FROM `pembayaran` INNER JOIN murid on pembayaran.nama_siswa=murid.Nama_SIswa WHERE pembayaran.jenis_pembayaran='spp' GROUP BY pembayaran.nama_siswa";
        Statement p = db.connection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement createpem(int nisn, String n, String jp, int bulan, int nom, String tgl, String kelas) throws SQLException {
        String sql = "insert into pembayaran (NISN,nama_siswa,jenis_pembayaran,bulan,nominal,tanggal,kelas) values (?,?,?,?,?,?,?);";
        sql += "update pembayaran set costumID = concat('TRX00',id);";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setInt(1, nisn);
        p.setString(2, n);
        p.setString(3, jp);
        p.setInt(4, bulan);
        p.setInt(5, nom);
        p.setString(6, tgl);
        p.setString(7, kelas);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement updatepemm(int bulan, String nisn) throws SQLException {
        String sql = "update pembayaran set bulan=? where NISN='" + nisn + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nisn);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement updatepem(String nisn, String n, String jp, int bulan, int nom, String tgl, String id) throws SQLException {
        String sql = "update pembayaran set NISN=?,nama_siswa=?,jenis_pembayaran=?,bulan=?,nominal=?,tanggal=? where nama_siswa='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nisn);
        p.setString(2, n);
        p.setString(3, jp);
        p.setInt(4, bulan);
        p.setInt(5, nom);
        p.setString(6, tgl);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement updatepem2(String nisn, String n, String jp, int bulan, int nom, String tgl, String id) throws SQLException {
        String sql = "update pembayaran set NISN=?,nama_siswa=?,jenis_pembayaran=?,bulan=?,nominal=?,tanggal=? where costumID='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nisn);
        p.setString(2, n);
        p.setString(3, jp);
        p.setInt(4, bulan);
        p.setInt(5, nom);
        p.setString(6, tgl);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement deletepem(String id) throws SQLException {
        String sql = "delete from pembayaran where costumID='" + id + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }

    public ResultSet checkpem(String nama, String jp) throws SQLException {
        String sql = "select * from pembayaran where (nama_siswa= '" + nama + "' and jenis_pembayaran= '" + jp + "' )";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public ResultSet checkpem22(int nisn) throws SQLException {
        String sql = "select * from pembayaran where NISN= '" + nisn + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public ResultSet getpem(String nama) throws SQLException {
        String sql = "select * from infopembayaran where pembayaran= '" + nama + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public ResultSet getpem2(int nisn) throws SQLException {
        String sql = "select * from pembayaran where nisn= '" + nisn + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }
    public ResultSet pemId() throws SQLException {
        String sql = "SELECT id FROM pembayaran ORDER BY id DESC LIMIT 1";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public ResultSet resetid() throws SQLException {
        String sql = "SELECT * from pembayaran ORDER BY id;";
        sql += "SET @count = 0;";
        sql += "UPDATE pembayaran  SET id = @count:= @count + 1;";
        sql += "update pembayaran set costumID = concat('TRX00',id);";
        sql += "ALTER TABLE pembayaran AUTO_INCREMENT = 1;";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public ResultSet searchPsiswa(String cari) throws SQLException {
        String sql = "SELECT *,SUM(CASE WHEN jenis_pembayaran='SPP' THEN nominal END) AS SPP,SUM(CASE WHEN jenis_pembayaran='UTS' THEN nominal END) AS UTS FROM `murid` INNER JOIN pembayaran on murid.Nama_SIswa LIKE '%" + cari + "%' AND murid.Nama_SIswa=pembayaran.nama_siswa GROUP BY murid.Nama_SIswa;";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public ResultSet searchpeSiswa(String cari) throws SQLException {
        String sql = "select * from pembayaran where nama_siswa like '%" + cari + "%'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
}
