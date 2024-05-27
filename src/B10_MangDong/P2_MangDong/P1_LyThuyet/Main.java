/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong.P1_LyThuyet;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Mang co dinh: size Mang dong => k can quan tam size. Size cua mang se tu
     * dong tang/giam dua vao so luong phan tu Collections: ArrayList, List,
     * LinkedList, HashMap, Tree.... ArrayList : Mang dong Cu phap:
     * ArrayList<Kieu du lieu> ten bien = new ArrayList<>();
     */
    public static void main(String[] args) {
        // mang so nguyen -> in 
        ArrayList<Integer> lists = new ArrayList<>();
        System.out.println(lists.size());
        lists.add(5); // 0
        lists.add(15); // 1
        lists.add(45); // 2
        lists.add(-5); // 3
//        System.out.println(lists.size());
//        lists.remove(0);
//        lists.remove(1);
//        System.out.println(lists.size());
        System.out.println(lists);
        for (int i = 0; i < lists.size(); i++) {
//            System.out.println(arr[i]);
            System.out.println(lists.get(i));
        }
//        lists.get(i)  == arr[i] : Lay ra gia tri o vi tri i 
        // Tao class MayTinh gom cac thuoc tinh ma - String, ten - String,
        // mauSac - String, gia - Double, khoiLuong - float
        // va cac cont, getter, setter va ham hienThiMayTinh(): void
        // Tao class Main su dung ArrayList 
        // de nhap thong tin cua 2 doi tuong may tinh
        // va in list May Tinh ra man hinh
    }
}
