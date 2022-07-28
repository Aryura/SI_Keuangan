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
public class siswadb {

    db db = new db();

    public ResultSet tabelSiswa() throws SQLException {
        String sql = "select * from murid";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement createSiswa(String nisn, String nis, String nsiswa, String jk, String tl, String tgll, String kelas, String alamat) throws SQLException {
        String sql = "insert into murid (NISN,NIS,Nama_Siswa,Jenis_Kelamin,Tempat_Lahir,Tanggal_Lahir,Kelas,Alamat) values (?,?,?,?,?,?,?,?);";
//        sql += "update kelas set customID = concat('KLS00',id);";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nisn);
        p.setString(2, nis);
        p.setString(3, nsiswa);
        p.setString(4, jk);
        p.setString(5, tl);
        p.setString(6, tgll);
        p.setString(7, kelas);
        p.setString(8, alamat);
        p.executeUpdate();
        return p;
    }

    public ResultSet checkNisn(String nisn) throws SQLException {
        String sql = "select * from murid where NISN= '" + nisn + "'";
        Statement p = db.connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement updateSiswa(String nisn, String nis, String nsiswa, String jk, String tl, String tgll, String kelas, String alamat) throws SQLException {
        String sql = "update murid set NISN=?,NIS=?,Nama_Siswa=?,Jenis_kelamin=?,Tempat_lahir=?,Tanggal_Lahir=?,Kelas=?,Alamat=? where NISN='" + nisn + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.setString(1, nisn);
        p.setString(2, nis);
        p.setString(3, nsiswa);
        p.setString(4, jk);
        p.setString(5, tl);
        p.setString(6, tgll);
        p.setString(7, kelas);
        p.setString(8, alamat);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement deleteSiswa(String nisn) throws SQLException {
        String sql = "delete from murid where NISN ='" + nisn + "'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }

    public ResultSet showKelas() throws SQLException {
        String sql = "SELECT nama_kelas FROM kelas ORDER BY nama_kelas asc";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public ResultSet searchSiswa(String cari) throws SQLException {
        String sql = "select * from murid where Nama_Siswa like '%" + cari + "%'";
        PreparedStatement p = db.connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
}
