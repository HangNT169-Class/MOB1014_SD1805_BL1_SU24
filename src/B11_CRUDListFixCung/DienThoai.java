/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_CRUDListFixCung;

/**
 *
 * @author hangnt
 */
public class DienThoai {

    private int ma;
    private String ten;
    private String hang;
    private String mau;
    private String boNho;
    private int gia;

    public DienThoai() {
    }

    public DienThoai(int ma, String ten, String hang, String mau, String boNho, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mau = mau;
        this.boNho = boNho;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void inThongTin() {
        System.out.println("ma" + ma);
        System.out.println("ten" + ten);
        System.out.println("hang" + hang);
        System.out.println("gia" + gia);
        System.out.println("mau" + mau);
        System.out.println("bo nho" + boNho);
        System.out.println("gia" + gia);
    }
}
