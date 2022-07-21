/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

/**
 *
 * @author phongtt
 */
public class ChuongTrinhKiemTra {
    
    public static void main(String[] args) {
        System.out.println(laSoTuNhien(18.0));
        System.out.println(laSoTuNhien(18.5));
        System.out.println(laSoTuNhien(18.9));
        System.out.println(laSoTuNhien(-18.0));
    }
    
    private static boolean laSoTuNhien(Double so) {
        // Số tự nhiên phải lớn hơn 0
        if (so < 0) return false;
        
        // Số tự nhiên không phải là số thập phân
        //  18.0 chấp nhận, nhưng 18.5 không nhận
        if (Math.floor(so) != so) return false;
        
        return true;
    }
}
