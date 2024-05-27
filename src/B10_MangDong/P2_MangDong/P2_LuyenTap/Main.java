/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong.P2_LuyenTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // Tao class Main su dung ArrayList 
        // de nhap thong tin cua 2 doi tuong may tinh
        // va in list May Tinh ra man hinh
        // B1: Khoi tao 1 list may tinh
        ArrayList<MayTinh>listMayTinh = new ArrayList<>();
        // B2: Nhap thong tin cua doi tuong may tinh
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap mau sac: ");
        String mauSac = sc.nextLine();
        System.out.println("Nhap gia: ");
        double gia = Double.valueOf(sc.nextLine());
        System.out.println("Nhap khoi luong: ");
        float khoiLuong = Float.valueOf(sc.nextLine());
        // B3: Khoi tao doi tuong may tinh
        MayTinh mt = new MayTinh(ma, ten, mauSac, gia, khoiLuong);
        // B4: Them may tinh vao list
        listMayTinh.add(mt);
        // DULICATE DOAN THEM MAY TINH 1 LAN NUA 
        System.out.println("Nhap ma: ");
        String ma1 = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten1 = sc.nextLine();
        System.out.println("Nhap mau sac: ");
        String mauSac1 = sc.nextLine();
        System.out.println("Nhap gia: ");
        double gia1 = Double.valueOf(sc.nextLine());
        System.out.println("Nhap khoi luong: ");
        float khoiLuong1 = Float.valueOf(sc.nextLine());
        // B3: Khoi tao doi tuong may tinh
        MayTinh mt1 = new MayTinh(ma1, ten1, mauSac1, gia1, khoiLuong1);
        // B4: Them may tinh vao list
        listMayTinh.add(mt1);
        // In thong tin list may
        // C1:
        for (int i = 0; i < listMayTinh.size(); i++) {
            listMayTinh.get(i).hienThiMayTinh();
        }
        // C2: for each
        for (MayTinh mt11 : listMayTinh) {
            mt11.hienThiMayTinh();
        }
    }
}
