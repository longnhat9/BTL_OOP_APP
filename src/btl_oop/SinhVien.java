package btl_oop;

public class SinhVien {
    private int Masv;
    private String Hoten;
    private String Gioitinh;
    private String Khoa;
    private String Quequan;
    
    public SinhVien() {
    }

    public SinhVien(int Masv, String Hoten , String Gioitinh , String Khoa, String Quequan) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.Gioitinh = Gioitinh;
        this.Khoa = Khoa;
        this.Quequan = Quequan;
    }
    
    public int getMasv() {
        return Masv;
    }

    public void setMasv(int Masv) {
        this.Masv = Masv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }
    
    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getQuequan() {
        return Quequan;
    }

    public void setQuequan(String Quequan) {
        this.Quequan = Quequan;
    }
}