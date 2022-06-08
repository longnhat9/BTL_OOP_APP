package btl_oop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CockroachDB_Connection {
    public static Connection cockroachdb_connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:postgresql://DESKTOP-0A92OHH:26257/sinhvien","root","");
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return conn;
    }
}