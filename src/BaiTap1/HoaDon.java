/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author FPT
 */
public class HoaDon {
    HoaDonHeader header = new HoaDonHeader();
    ArrayList<CTHD> chitiet = new ArrayList<>();

    protected HoaDon(Builder builder) {
        this.header = builder.header;
        this.chitiet= builder.chitiet;
    }
    public String hienThi(){
        String s="";
        for(int i=0; i<chitiet.size(); i++){
            s += "Ten san pham: "+chitiet.get(i).getTenSP()
           +"So luong: "+chitiet.get(i).getSoluong()+
            "Don gia: "+chitiet.get(i).getDongia()
            +"Chiet khau: "+chitiet.get(i).getChietkhau();
        }
        return s;
    }

    @Override
    public String toString() {
        
        return "Ma hoa don: "+header.getMaHD()+"Ngay ban: "+header.getNgayban()
                +"Ten khach hang: "+header.getTenKH()+hienThi();
        
    }
    public static class Builder{
        HoaDonHeader header = new HoaDonHeader();
        private ArrayList<CTHD> chitiet;
        public Builder() {
        }
        public Builder addMaHD(String MaHD){
            this.header.MaHD = MaHD;
            return this;
        }
        public Builder addNgayBan(Date ngayBan){
            this.header.ngayBan = ngayBan;
            return this;
        }
        public Builder addTenKH(String tenKH){
            this.header.TenKH = tenKH;
            return this;
        }
        public Builder addSanPham(CTHD tenSP){
            return this;   
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
    
}
