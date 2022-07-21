/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class ChuongTrinh {
    
    public static void main(String[] args) {
        SinhVien[] dssv = new SinhVien[] {
          new SinhVien("A", 37.0, true, true, true),
          new SinhVien("B", 35.0, true, true, true),
          new SinhVien("C", 37.0, false, true, true)
        };
        
        CuaKiemTra cktHN = new CuaKiemTraThanNhiet();
        cktHN.setCuaTiepTheo(new CuaKiemTraVe());
        
        CuaKiemTra cktHCM = new CuaKiemTraVe();
        cktHCM.setCuaTiepTheo(new CuaKiemTraThanNhiet());
        
        for(SinhVien sv : dssv) {
            String ketQua = cktHN.kiemTra(sv);
            System.out.println(sv.getTen() + " " + ketQua);
        }
    }
}
