/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraVe extends CuaKiemTra {

    @Override
    public String kiemTra(SinhVien sv) {
        if (sv.getVeThamGia()) {
            if (cuaTiepTheo != null) {
                return cuaTiepTheo.kiemTra(sv);
            } else {
                return VALID;
            }
        } else {
            return "Không mang vé!";
        }
    }
    
}
