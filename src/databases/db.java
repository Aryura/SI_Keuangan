package databases;

import java.sql.*;

/**
 *
 * @author maula
 */
public class db {

    Connection con;

    public Connection connection() {
        String url = "jdbc:mysql://localhost/mts?allowMultiQueries=true";
        try {
            con = DriverManager.getConnection(url, "root", "");
            System.out.println("berhasil koneksi Database");
        } catch (SQLException ex) {
            System.out.println("gagal koneksi Database" + ex);
        }
        return con;
    }

    // LOGIN LOGIN LOGIN LOGIN LOGIN
    public ResultSet login(String username, String password) throws SQLException {
        String sql = "select username, password from admin where username='" + username + "' and password='" + password + "'";
        PreparedStatement p = connection().prepareStatement(sql);
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    //Data Admin
    public ResultSet tabeladmin() throws SQLException {
        String sql = "select * from admin";
        Statement p = connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public PreparedStatement createAdmin(String n, String us, String password, String jk, String notlp, String al) throws SQLException {
        String sql = "insert into admin (nama,username,password,jenis_kelamin,no_telepon,alamat) values (?,?,?,?,?,?);";
        sql += "update admin set costum_id = concat('adm00',id)";
        PreparedStatement p = connection().prepareStatement(sql);
        p.setString(1, n);
        p.setString(2, us);
        p.setString(3, password);
        p.setString(4, jk);
        p.setString(5, notlp);
        p.setString(6, al);
        p.executeUpdate();
        return p;
    }

    public ResultSet checkadmin(String nama) throws SQLException {
        String sql = "select * from admin where nama= '" + nama + "'";
        Statement p = connection().createStatement();
        ResultSet r = p.executeQuery(sql);
        return r;
    }

    public ResultSet adm() throws SQLException {
        String sql = "SELECT id FROM admin ORDER BY id DESC LIMIT 1";
        PreparedStatement p = connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public PreparedStatement updateAdmin(String n, String us, String password, String jk, String notlp, String al, String dd) throws SQLException {
        String sql = "update admin set nama=?, username=?, password=?, jenis_kelamin=?, no_telepon=?, alamat=? where costum_id='" + dd + "'";
        PreparedStatement p = connection().prepareStatement(sql);
        p.setString(1, n);
        p.setString(2, us);
        p.setString(3, password);
        p.setString(4, jk);
        p.setString(5, notlp);
        p.setString(6, al);
        p.executeUpdate();
        return p;
    }

    public PreparedStatement deleteAdmin(String id) throws SQLException {
        String sql = "delete from admin where costum_id ='" + id + "'";
        PreparedStatement p = connection().prepareStatement(sql);
        p.executeUpdate();
        return p;
    }

    public ResultSet searchAdmin(String cari) throws SQLException {
        String sql = "select * from admin where nama like '%" + cari + "%'";
        PreparedStatement p = connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    public ResultSet resetid() throws SQLException {
        String sql = "SELECT * from admin ORDER BY id;";
        sql += "SET @count = 0;";
        sql += "UPDATE admin  SET id = @count:= @count + 1,costum_id = concat('adm00',id);";
        sql += "ALTER TABLE admin AUTO_INCREMENT = 1;";
        PreparedStatement p = connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }
    
    public ResultSet customId()throws SQLException{
    String sql = "select concat('adm00',id) as costum_id from admin";
        PreparedStatement p = connection().prepareStatement(sql);
        ResultSet r = p.executeQuery();
        return r;
    }

    
}
