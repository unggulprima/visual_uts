package Config;
import java.sql.*;
import javax.swing.JOptionPane;
public class KoneksiDB {
private static Connection conn;
public static Connection getKoneksi() {
try {
//untuk menentukan driver DB
Class.forName("com.mysql.cj.jdbc.Driver");
//untuk membuat koneksi dari DB ke driver
String url = "jdbc:mysql://localhost:3306/pv_biodata";
String user = "root";
String password = "";
conn = DriverManager.getConnection(url, user, password);
//pesan jika koneksi berhasil
JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
} catch (Exception e) {
//pesan jika koneksi gagal
JOptionPane.showMessageDialog(null, "Koneksi Gagal");
}
return conn;
}

    private static class DriverManager {

        private static Connection getConnection(String url, String user, String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }
}