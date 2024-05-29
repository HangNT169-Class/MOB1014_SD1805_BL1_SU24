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
public class DienThoaiService {

    // service => xu ly logic 
    // trong service => chua cac ham ma menu can 
    // it nhat 8 ham 
//    private ArrayList<DienThoai> lists = new ArrayList<>();
//
//    public DienThoaiService() {
//        // fake data 5 phan tu 
//        lists.add(new DienThoai(1, "dt1", "hang1", "xanh", "128GB", 10));
//        lists.add(new DienThoai(2, "dt2", "hang2", "xanh1", "512GB", 11));
//        lists.add(new DienThoai(3, "dt3", "hang3", "xanh2", "128GB", 12));
//        lists.add(new DienThoai(4, "dt4", "hang4", "xanh3", "256GB", 13));
//        lists.add(new DienThoai(5, "dt5", "hang5", "xanh4", "128GB", 14));
//    }
    public void themDienThoai(ArrayList<DienThoai> listDienThoai) {
        // B1: Nhap tt cua toan bo dt tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap thong tin dien thoai: ");
        System.out.println("Ma: ");
        int ma = Integer.valueOf(sc.nextLine());
        System.out.println("Ten: ");
        String ten = sc.nextLine();
        System.out.println("Hang: ");
        String hang = sc.nextLine();
        System.out.println("Mau: ");
        String mau = sc.nextLine();
        System.out.println("Bo nho: ");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.println("Gia: ");
        int gia = Integer.valueOf(sc.nextLine());
        // B2: Khoi tao doi tuong
        DienThoai dt = new DienThoai(ma, ten, hang, mau, hang, gia);
        // B3: Them phan tu vao list
        listDienThoai.add(dt);
    }

    public void hienThiDanhSachDienThoai(ArrayList<DienThoai> listDienThoai) {
        // C1: for i 
//        for (int i = 0; i < listDienThoai.size(); i++) {
//            listDienThoai.get(i).inThongTin();
//        }
        // C2: for each
//        for(Doi tuong : ten mang){
//        
//         }
//        dt = listDienThoai.get(i);
//        for (DienThoai dt : listDienThoai) {
//            dt.inThongTin();
//        }
        // C3: for each + lamda (->)
//        listDienThoai.forEach(dt -> dt.inThongTin());
        // C4: for each + method reference (::)
        listDienThoai.forEach(DienThoai::inThongTin);
    }

    public void timKiemDienThoaiTheoGia() {

    }

    public void timKiemDienThoaiTheoBoNho() {

    }

    // doi cho o1, o2 neu can sap xep theo chieu nguoc lai
    // chuoi -> compareTo
    public void sapXepGiamDanTheoTen(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o2.getTen().compareTo(o1.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    // so -> dung dau - 
    public void sapXepTangDanTheoGia(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o1.getGia() - o2.getGia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    public void xoaDienThoaiTheoViTri(int viTri, ArrayList<DienThoai> lists) {
        lists.remove(viTri);
    }

    public void xoaDienThoaiTheoMa() {

    }

}
