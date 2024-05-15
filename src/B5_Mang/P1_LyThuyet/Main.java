/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_Mang.P1_LyThuyet;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    /**
     * Có 2 loại mảng:
     *      - C: mang co dinh => Biet truoc tong so luong va size 
     *      - Java: mang dong => K can quan tam toi size:
     *          Collections(ArrayList)
     * VD:       9 -3 5 1 8   => Gia tri cac phan tu cua mang
     *           0  1 2 3 4
     * Khi mang gom 2 thanh phan : vi tri & gia tri 
     * Vi tri cua mang bat dau : 0 
     * Vi tri cua mang ket thuc: size - 1
     * Mang ten la a
     * a[0] = 9 => gia tri cua vi tri dau tien
     * vi tri bat ky i => gia tri : a[i]
     * Cu phap:
     *      kieu du lieu ten bien[] = new kieudulieu[size]
     * VD: int arr[] = new int[size];
     */
    public static void main(String[] args) {
        // Nhap 1 mang so nguyen tu ban phim. Va in ra man hinh
        // B1: Nhap size 
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap size:");
        int size = Integer.valueOf(sc.nextLine());
        // B2: Khai bao mang 
        int arr[] = new int[size];
        // B3: Nhap mang 
        System.out.println("Moi nhap cac phan tu trong mang");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.valueOf(sc.nextLine());
        }
        // B4: in 
        System.out.println("Cac phan tu la:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
