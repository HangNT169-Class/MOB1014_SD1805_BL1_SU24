/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP;

/**
 *
 * @author hangnt
 */
public class Main {
//    SQL Injection => lo hong bao mat he thong 

    /**
     * Tao class SinhVien gom cac thuoc tinh : 
     * ma - String, ten - String , tuoi
     * - int, diaChi - String, kyHoc - int,
     * matKhauFacebook - String,
     * soDuTaiKhoanNganHang - int 
     * va cac contructor, getter, setter va ham
     * inThongTin(): void 
     * Tao class Main hien thi 
     * thong tin 1 sinh vien gia tri fix cung
     */
//    SinhVien sv = new SinhVien();
//    SinhVien sv1 = new SinhVien();
//
//    Main m = new Main();
    public static void main(String[] args) {
        // C1: Dung contructor k tham so
        // B1: Khoi tao doi tuong SinhVien 
//        SinhVien sv = new SinhVien();
//        // B2: Thay doi thong tin
//        sv.setMa("HE130461");
//        sv.setDiaChi("gfsdg");
//        sv.setTuoi(10);
//        // set 7 lan 
//        // B3: In sinh vien 
//        sv.inThongTin();
//        // in ma
////        System.out.println(sv.getMa());
        // C2: Contructor full tham so 
        SinhVien sv1 = 
                new SinhVien("afgdga", "adsffg", 
                        10, "fads", 0, "agaf", 6540);
        sv1.inThongTin();
        
    }
}
