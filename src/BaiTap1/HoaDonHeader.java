/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Date;

/**
 *
 * @author FPT
 */
public class HoaDonHeader {
    public String MaHD, TenKH;
    public Date ngayBan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String MaHD, String TenKH, Date Ngayban) {
        this.MaHD = MaHD;
        this.TenKH = TenKH;
        this.ngayBan = Ngayban;
    }

    


    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public Date getNgayban() {
        return ngayBan;
    }

    public void setNgayban(Date Ngayban) {
        this.ngayBan = Ngayban;
    }
    
}
