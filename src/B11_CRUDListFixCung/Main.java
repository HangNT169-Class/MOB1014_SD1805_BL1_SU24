/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_CRUDListFixCung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    // Goi cac ham ben service 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DienThoai> lists = new ArrayList<>();
        DienThoaiService service = new DienThoaiService();
        int menu;
        do {
            System.out.print("Moi ban chon menu");
            menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1: {
                    // Cach goi ham tu bat cu class nao 
                    // Cu phap:
//                    new class chua ham muon goi().tenham();
                    service.themDienThoai(lists);
                    break;
                }
                case 2: {
                    service.hienThiDanhSachDienThoai(lists);
                    break;
                }
                case 3: {
                    System.out.println("3");
                    break;
                }
                case 4: {
                    System.out.println("4");
                    break;
                }
                case 5: {
                    service.sapXepGiamDanTheoTen(lists);
                    System.out.println("Danh sach sau khi sx");
                    service.hienThiDanhSachDienThoai(lists);
                    break;
                }
                case 6: {
                    service.sapXepTangDanTheoGia(lists);
                    System.out.println("Danh sach sau khi sx");
                    service.hienThiDanhSachDienThoai(lists);
                    break;
                }
                case 7: {
                    System.out.println("Moi nhap vao vi tri muon xoa");
                    int viTri = Integer.valueOf(sc.nextLine());
                    service.xoaDienThoaiTheoViTri(viTri, lists);
                    System.out.println("Danh sach sau khi xoa");
                    service.hienThiDanhSachDienThoai(lists);
                    break;
                }
                case 8: {
                    System.out.println("8");
                    break;
                }
                case 0: {
                    System.out.println("Bạn đã thoát menu ");
                    break;
                }
                default: {
                    System.out.println("Chức năng này ko tồn tại.");
                    break;
                }
            }
        } while (menu != 0);
    }
}
