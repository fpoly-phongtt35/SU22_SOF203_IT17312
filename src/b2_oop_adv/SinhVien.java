/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2_oop_adv;

/**
 *
 * @author phongtt
 */
public class SinhVien {
    
    private String ten;
    private Double thanNhiet;
    private Boolean veThamGia;
    private Boolean chatKichThich;
    private Boolean vuKhi;

    public SinhVien() {
    }

    public SinhVien(String ten, Double thanNhiet, Boolean veThamGia, Boolean chatKichThich, Boolean vuKhi) {
        this.ten = ten;
        this.thanNhiet = thanNhiet;
        this.veThamGia = veThamGia;
        this.chatKichThich = chatKichThich;
        this.vuKhi = vuKhi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getThanNhiet() {
        return thanNhiet;
    }

    public void setThanNhiet(Double thanNhiet) {
        this.thanNhiet = thanNhiet;
    }

    public Boolean getVeThamGia() {
        return veThamGia;
    }

    public void setVeThamGia(Boolean veThamGia) {
        this.veThamGia = veThamGia;
    }

    public Boolean getChatKichThich() {
        return chatKichThich;
    }

    public void setChatKichThich(Boolean chatKichThich) {
        this.chatKichThich = chatKichThich;
    }

    public Boolean getVuKhi() {
        return vuKhi;
    }

    public void setVuKhi(Boolean vuKhi) {
        this.vuKhi = vuKhi;
    }
    
    
}
