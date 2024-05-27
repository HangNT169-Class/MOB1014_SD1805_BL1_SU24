/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_NhapDuLieuTuBanPhim;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // Tạo class Main. 
        // Nhập thông tin của 1 đối tượng GiangVien 
        // từ bàn phím và in ra màn hình
        // B1: Nhap thong tt cua doi tuong GV 
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap thong tin giang vien: ");
        System.out.println("moi nhap ma:");
        String ma = nhap.nextLine();
        System.out.println("moi nhap ten");
        String ten = nhap.nextLine();
        System.out.println("moi nhap dia chi");
        String diaChi = nhap.nextLine();
        System.out.println("moi nhap canNang");
        float canNang = Float.valueOf(nhap.nextLine());
        System.out.println("moi nhap chieu cao: ");
        double chieuCao = Double.valueOf(nhap.nextLine());
        System.out.println("moi nhap bac: ");
        int bac = Integer.valueOf(nhap.nextLine());
        // B2: Khoi tao doi tuong 
        GiangVien gv = new GiangVien(ten, diaChi, canNang,
                chieuCao, bac, ma);
        // B3: In tt gv
        gv.inThongTin();
    }
}
