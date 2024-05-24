/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    /**
     * OOP - Lap trinh huong doi tuong 4 dac trung: 1. Tinh dong goi 2. Tinh ke
     * thua 3. Tinh truu tuong 4. Tinh da hinh
     *
     * Doi tuong(Object): Co 2 dac trung: - thuoc tinh (attribute) <=> Cac bien
     * - phuong thuoc(method) <=> Cac ham Tinh dong goi: Che giau moi thu khong
     * can thiet Pham vi truy cap (Access Modifier) : danh bien/ham/class Co 4
     * pvtc: public , protected, default, private
     */
    /**
     * Tao class SinhVien gom cac thuoc tinh : ma - String, ten - String , tuoi
     * - int, diaChi - String, kyHoc - int, matKhauFacebook - String,
     * soDuTaiKhoanNganHang - int va cac contructor, getter, setter va ham
     * inThongTin(): void Tao class Main hien thi thong tin 1 sinh vien
     */
    private String ma; // null
    private String ten;
    private int tuoi; // 0 
    private String diaChi;
    private int kyHoc;
    private String matKhauFacebook;
    private int soDuTaiKhoan;

//    public SinhVien() {
//    }
//
//    public SinhVien(String ma, String ten, int tuoi, String diaChi, int kyHoc, String matKhauFacebook, int soDuTaiKhoan) {
//        this.ma = ma;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.diaChi = diaChi;
//        this.kyHoc = kyHoc;
//        this.matKhauFacebook = matKhauFacebook;
//        this.soDuTaiKhoan = soDuTaiKhoan;
//    }
    // C1: chuot phai -> insert code -> contructor -> roi tao 2 : k tham so, co tham so
    // C2: Ctrl space 2 lan 
    // Contructor: Dung de khoi tao 1 doi tuong.
    // Khoi tao doi tuong bang tu khoa new 
    /**
     * Co 2 loai contructor: - contructor khong tham so - contructor co tham so
     * Default cua 1 class la loai contructor khong tham so. Khi tao contructor
     * co tham . Muon dung contructor k tham so => tao DHNB contructor : ten
     * contructor trung vs ten class. contructor khong phai ham
     */
    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int tuoi, String diaChi, int kyHoc,
            String matKhauFacebook, int soDuTaiKhoan) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.kyHoc = kyHoc;
        this.matKhauFacebook = matKhauFacebook;
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    // Getter => Lay ra thong tin 
    // getMa => Lay ra ma cua doi tuong sinh vien 
    public String getMa() {
        return ma;
    }

    // Setter: Thay doi thong tin
    // setMa => Update/Sua/Thay doi ma ban dau cua sinh vien
    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getMatKhauFacebook() {
        return matKhauFacebook;
    }

    public void setMatKhauFacebook(String matKhauFacebook) {
        this.matKhauFacebook = matKhauFacebook;
    }

    public int getSoDuTaiKhoan() {
        return soDuTaiKhoan;
    }

    public void setSoDuTaiKhoan(int soDuTaiKhoan) {
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    public void inThongTin() {
        // Liet ke tat ca cac thong tin cua doi tuong 
        System.out.println("Ma: " + ma);
        System.out.println("Tuoi: " + tuoi);

        // tu lam ...
    }

}
