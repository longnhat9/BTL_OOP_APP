package btl_oop;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SinhVien_Modify {
    private static Connection conn;
    
    public static void set_Connection(Connection conn){
        SinhVien_Modify.conn = conn;
    }
    
    public static ArrayList<SinhVien> querry_masv(){
        ArrayList<SinhVien> arr_masv = new ArrayList<SinhVien>();
        try{
            Statement statement = conn.createStatement();
            
            String sql = "SELECT masv FROM quan_ly_sinh_vien";
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                SinhVien sv = new SinhVien();
                sv.setMasv(result.getInt("masv"));
                arr_masv.add(sv);
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return arr_masv;
    }
    
    public static int querry_one_masv(int masv_){
        int querry_masv = -999;
        try{
            Statement statement = conn.createStatement();
            
            String sql = "SELECT masv FROM quan_ly_sinh_vien WHERE " + masv_ + " IN (SELECT masv FROM quan_ly_sinh_vien)";
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                querry_masv = result.getInt("masv");
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return querry_masv;
    }
    
    public static ArrayList<SinhVien> sinhvien_list(){
        ArrayList<SinhVien> list_sv = new ArrayList<SinhVien>();
        try{
            Statement statement = conn.createStatement();
            
            String sql = "SELECT * FROM quan_ly_sinh_vien";
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                SinhVien sv = new SinhVien();
                sv.setMasv(result.getInt("masv"));
                sv.setHoten(result.getString("hoten"));
                sv.setGioitinh(result.getString("gioitinh"));
                sv.setKhoa(result.getString("khoa"));
                sv.setQuequan(result.getString("quequan"));
                
                list_sv.add(sv);
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list_sv;
    }
    
    public static void insert_sv(SinhVien sinhvien){
        try{
            String sql = "INSERT INTO quan_ly_sinh_vien (masv , hoten , gioitinh , khoa , quequan) VALUES (? , ? , ? , ? , ?)";
            
            PreparedStatement preStatement = conn.prepareStatement(sql);
            
            preStatement.setInt(1, sinhvien.getMasv());
            preStatement.setString(2, sinhvien.getHoten());
            preStatement.setString(3, sinhvien.getGioitinh());
            preStatement.setString(4, sinhvien.getKhoa());
            preStatement.setString(5, sinhvien.getQuequan());
            
            preStatement.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public static void update_sv(SinhVien sinhvien){
        try{
            String sql_ = "SELECT * FROM quan_ly_sinh_vien WHERE masv = " + sinhvien.getMasv();
            
            Statement statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery(sql_);
            
            int masv_ = -999;
            String hoten_ = null, gioitinh_ = null , khoa_ = null , quequan_ = null;
            
            while(result.next()){
                masv_ = result.getInt("masv");
                hoten_ = result.getString("hoten");
                gioitinh_ = result.getString("gioitinh");
                khoa_ = result.getString("khoa");
                quequan_ = result.getString("quequan");
            }
            
            if(masv_ != sinhvien.getMasv()){
                try{
                    String sql = "UPDATE quan_ly_sinh_vien SET masv = ?";
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setInt(1, masv_);
                    preStatement.executeUpdate();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
            }
            
            if(hoten_.equals(sinhvien.getHoten()) == false){
                try{
                    String sql = "UPDATE quan_ly_sinh_vien SET hoten = ? WHERE masv = ?";
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, sinhvien.getHoten());
                    preStatement.setInt(2, sinhvien.getMasv());
                    preStatement.executeUpdate();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
            }
            
            if(gioitinh_.equals(sinhvien.getGioitinh()) == false){
                try{
                    String sql = "UPDATE quan_ly_sinh_vien SET gioitinh = ? WHERE masv = ?";
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, sinhvien.getGioitinh());
                    preStatement.setInt(2, sinhvien.getMasv());
                    preStatement.executeUpdate();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
            }
            
            if(khoa_.equals(sinhvien.getKhoa()) == false){
                try{
                    String sql = "UPDATE quan_ly_sinh_vien SET khoa = ? WHERE masv = ?";
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, sinhvien.getKhoa());
                    preStatement.setInt(2, sinhvien.getMasv());
                    preStatement.executeUpdate();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
            }
            
            if(quequan_.equals(sinhvien.getQuequan()) == false){
                try{
                    String sql = "UPDATE quan_ly_sinh_vien SET quequan = ? WHERE masv = ?";
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, sinhvien.getQuequan());
                    preStatement.setInt(2, sinhvien.getMasv());
                    preStatement.executeUpdate();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public static void delete_sv(int Masv){
        try{
            String sql = "DELETE FROM quan_ly_sinh_vien WHERE masv = ?";
            
            PreparedStatement preStatement = conn.prepareStatement(sql);
            
            preStatement.setInt(1, Masv);
            
            preStatement.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public static ArrayList<SinhVien> search_sv(SinhVien sv){
        ArrayList<SinhVien> sv_list = new ArrayList<SinhVien>();
        try{
            if(sv.getMasv() != -999){
                String sql_masv = "SELECT * FROM quan_ly_sinh_vien WHERE masv = " + sv.getMasv();
                
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql_masv);
                
                while(result.next()){
                    SinhVien sv_ = new SinhVien();
                    sv_.setMasv(result.getInt(1));
                    sv_.setHoten(result.getString(2));
                    sv_.setGioitinh(result.getString(3));
                    sv_.setKhoa(result.getString(4));
                    sv_.setQuequan(result.getString(5));
                    
                    sv_list.add(sv_);
                }
            }else if(sv.getHoten() != null){
                String sql_hoten = "SELECT * FROM quan_ly_sinh_vien WHERE hoten LIKE '%" + sv.getHoten() + "%'";
                
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql_hoten);
                
                while(result.next()){
                    SinhVien sv_ = new SinhVien();
                    sv_.setMasv(result.getInt(1));
                    sv_.setHoten(result.getString(2));
                    sv_.setGioitinh(result.getString(3));
                    sv_.setKhoa(result.getString(4));
                    sv_.setQuequan(result.getString(5));
                    
                    sv_list.add(sv_);
                }
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return sv_list;
    }
    
    public static SinhVien get_Info_SV_by_masv(int manv_){
        SinhVien sv = new SinhVien();
        try{
            String sql = "SELECT * FROM quan_ly_sinh_vien WHERE masv = " + manv_;
            
            Statement st = conn.createStatement();
            
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()){
                sv.setMasv(result.getInt(1));
                sv.setHoten(result.getString(2));
                sv.setGioitinh(result.getString(3));
                sv.setKhoa(result.getString(4));
                sv.setQuequan(result.getString(5));
            }
            
            st.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e);
        }
        return sv;
    }
}