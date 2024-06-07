/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B15_KeThua_Chuoi.P1_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 4 tinh chat: 
     * - dong goi : access modifier (Pham vi truy cap): public...
     * - ke thua: class con se ke thua cac ham/thuoc tinh cua class Cha 
     * => ke thua : tu khoa extends
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Moi nhap thong tin sinh vien ");
        System.out.println("Mo nhap ten sinh vien ");
        String ten = nhap.nextLine();
        System.out.println("Moi nhap tuoi sinh vien ");
        int tuoi = Integer.valueOf(nhap.nextLine());
        System.out.println("Mo nhap gioi tinh ");
        int gioiTinh = Integer.valueOf(nhap.nextLine());
        System.out.println("Moi nhap que quan ");
        String queQuan = nhap.nextLine();
        System.out.println("Moi nhap so dien thoai ");
        String sdt = nhap.nextLine();
        System.out.println("Moi nhap email ");
        String email = nhap.nextLine();
        System.out.println("Moi nhap diem sinh vien ");
        double diem = Double.valueOf(nhap.nextLine());
        SinhVien sv = new SinhVien(diem, ten, tuoi, gioiTinh, queQuan, sdt, email);
        sv.display();
    }
}
