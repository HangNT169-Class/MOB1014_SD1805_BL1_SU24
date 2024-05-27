/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong.P2_LuyenTap;

/**
 *
 * @author hangnt
 */
public class MayTinh {

    // Tao class MayTinh gom cac thuoc tinh ma - String, ten - String,
    // mauSac - String, gia - Double, khoiLuong - float
    // va cac contructor, getter, setter va ham hienThiMayTinh(): void
    // Tao class Main su dung ArrayList 
    // de nhap thong tin cua 2 doi tuong may tinh
    // va in list May Tinh ra man hinh
    private String ma;
    private String ten;
    private String mauSac;
    private Double gia;
    private float khoiLuong;

    public MayTinh() {
    }

    public MayTinh(String ma, String ten, String mauSac, Double gia, float khoiLuong) {
        this.ma = ma;
        this.ten = ten;
        this.mauSac = mauSac;
        this.gia = gia;
        this.khoiLuong = khoiLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public void hienThiMayTinh() {
        System.out.println("ma:" + ma);;
        System.out.println("ten:" + ten);
        System.out.println("mau sac:" + mauSac);
        System.out.println("gia" + gia);
        System.out.println("khoi luong" + khoiLuong);
    }
}
