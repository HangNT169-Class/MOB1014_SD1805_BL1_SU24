/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieu.P1_LyThuyetTrenLop;

/**
 *
 * @author hangnt
 */
public class KieuDuLieu {
    /**
     * Co 2 loai kieu du lieu 
     * 1. Kieu nguyen thuy: la kieu du trong C
     *  VD: int, float, double, String, boolean .....
     * 2. kieu Object : co the tu tao kieu du lieu 
     *  VD1: Integer, Float, Double, String, Boolean..
     *  VD2: SinhVien, DongVat...
     * Chu y: String vua nguyen thuy vua la Object
     * Co 3 dac trung cua kieu Object:
     *      1. Chu cai dau viet hoa 
     *      2. Duoc khoi tao bang tu khoa new 
     *      3. Khi cham thi show ra goi y 
     * Khai bao bien:
     *  kieu du lieu tenBien;
     * Co 2 quy tac dac tien:
     *  - ran(snake case) : _: number_first 
     *  - lac da(camel case): numberFirst
     */
    public static void main(String[] args) {
        int number = 5;
        Integer numberFirst = new Integer("5");
//        number. // Nguyen thuy 
        numberFirst.byteValue(); // Object
//        String name = "SD1805"; // nguyen thuy 
//        String name1 = new String("SD1806"); // Object
    }
}
