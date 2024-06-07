/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B15_KeThua_Chuoi.P1_KeThua;

/**
 *
 * @author hangnt
 */
// Sinh Vien ke thua tu class Nguoi 
public class SinhVien extends Nguoi {

    private double diem;
    // SV co 7 thuoc tinh (ke thua tu nguoi)

    public SinhVien() {
    }

    public SinhVien(double diem, String ten, int tuoi, int gioiTinh,
            String queQuan, String sdt, String email) {
        super(ten, tuoi, gioiTinh, queQuan, sdt, email);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public void display() {
        // in cac thuoc tinh cua doi tuong Sinh Vien 
        // SV => 7 
        System.out.println("Diem " + diem); // thuoc tinh rieng 
        // this => goi ham/bien chinh no 
        // super => goi ham/ bien cua class Cha 
//        System.out.println("Ten: " + super.getTen());
//        System.out.println("Tuoi: " + super.getTuoi());
//        System.out.println("Gioi tinh: " + super.getGioiTinh());
//        System.out.println("Que quan: " + super.getQueQuan());
//        System.out.println("sdt: " + super.getSdt());
//        System.out.println("email: " + super.getEmail());
        super.display();
    }

}
