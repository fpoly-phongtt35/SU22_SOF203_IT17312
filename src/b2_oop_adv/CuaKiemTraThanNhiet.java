/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class CuaKiemTraThanNhiet extends CuaKiemTra {

    @Override
    public String kiemTra(SinhVien sv) {
        Double thanNhiet = sv.getThanNhiet();
        
        if (thanNhiet > 36.5 && thanNhiet < 37.5) {
            if (cuaTiepTheo != null) {
                return cuaTiepTheo.kiemTra(sv);
            } else {
                return VALID;
            }
        } else {
            return "Thân nhiệt không hợp lệ";
        }
    }
    
}
