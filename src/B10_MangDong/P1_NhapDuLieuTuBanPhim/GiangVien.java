/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_NhapDuLieuTuBanPhim;

/**
 *
 * @author hangnt
 */
public class GiangVien {
//    Lớp GiangVien gồm các thuộc tính: ma (kiểu String),
    // ten (kiểu String), diaChi (kiểu String), canNang (kiểu float),
    // chieuCao (kiểu double), bac (kiểu int),
    // và các phương thức constructor, getter, setter và
    // phương thức inThongTin() để in thông tin của giảng viên.

    private String ten;
    private String diaChi;
    private float canNang;
    private double chieuCao;
    private int bac;
    private String ma;

    public GiangVien() {
    }

    public GiangVien(String ten, String diaChi, float canNang, double chieuCao, int bac, String ma) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.bac = bac;
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
//
//    @Override
//    public String toString() {
//        return "GiangVien{" + "ten=" + ten + ", diaChi=" + diaChi + ", canNang=" + canNang + ", chieuCao=" + chieuCao + ", bac=" + bac + ", ma=" + ma + '}';
//    }

    public void inThongTin() {
        System.out.println("Ma : " + ma);
        System.out.println("Ten : " + ten);
        System.out.println("Dia chi : " + diaChi);
        System.out.println("Can nang : " + canNang);
        System.out.println("Chieu cao : " + chieuCao);
        System.out.println("Bac : " + bac);
    }

}
