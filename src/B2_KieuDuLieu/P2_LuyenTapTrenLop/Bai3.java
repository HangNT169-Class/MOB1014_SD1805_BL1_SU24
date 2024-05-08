/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieu.P2_LuyenTapTrenLop;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Bai3 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("moi nhap ten: ");
        String name = a.nextLine();
        System.out.println("vui long nhap tuoi: ");
        int tuoi = a.nextInt();
        // C1: them xuong dong 
        a.nextLine();
        System.out.println("vui long nhap dia chi: ");
        String diaChi = a.nextLine();
        System.out.println("vui long nhap ky hoc: ");
        int kyHoc = a.nextInt();
        System.out.println("vui long nhap nganh hoc: ");
        String nganh = a.nextLine();
        System.out.println("ten ban la: " + name);
        System.out.println("tuoi ban la: " + tuoi);
        System.out.println("ban o: " + diaChi);
        System.out.println("ban hoc nganh: " + nganh);
        System.out.println("ban dang hoc ky: " + kyHoc);

    }
}
