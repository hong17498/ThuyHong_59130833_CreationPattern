/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author FPT
 */
public class CTHD {
    String tenSP;
    int soLuong;
    float donGia, chietKhau;

    public CTHD() {
    }
    
    public CTHD(String TenSP, int soluong, int dongia, float chietkhau) {
        this.tenSP = TenSP;
        this.soLuong = soluong;
        this.donGia = dongia;
        this.chietKhau = chietkhau;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String TenSP) {
        this.tenSP = TenSP;
    }

    public int getSoluong() {
        return soLuong;
    }

    public void setSoluong(int soluong) {
        this.soLuong = soluong;
    }

    public double getDongia() {
        return donGia;
    }

    public void setDongia(int dongia) {
        this.donGia = dongia;
    }

    public float getChietkhau() {
        return chietKhau;
    }

    public void setChietkhau(float chietkhau) {
        this.chietKhau = chietkhau;
    }
}
