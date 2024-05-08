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
public class Bai1 {
    // 1. Nhap 3 so nguyen tu ban phim va in 3 so nguyen ra man hinh

    public static void main(String[] args) {
        Scanner nhapSo = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen dau tien : ");
        int soDau = nhapSo.nextInt();
        System.out.println("Moi nhap so nguyen thu 2 : ");
        int soT2 = nhapSo.nextInt();
        System.out.println("Moi nhap so nguyen thu 3 : ");
        int soT3 = nhapSo.nextInt();
        System.out.println("3 so nguyen vua nhap la" + soDau);
        System.out.println("3 so nguyen vua nhap la" + soT2);
        System.out.println("3 so nguyen vua nhap la" + soT3);
    }
}
