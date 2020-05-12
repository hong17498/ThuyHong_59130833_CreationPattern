/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author FPT
 */
public class Main {
     public static void main(String[] args) throws ParseException {
        CTHD sanpham = new CTHD("Kem duong da", 10, 1000000, (float)0.1);
        
        HoaDon hoadon = new HoaDon.Builder()
                .addMaHD("HD01")
                .addTenKH("Nguyen Thi Xuan")
                .addNgayBan(new SimpleDateFormat("dd/MM/yy").parse("01/09/2000")
                .addSanPham(sanpham) 
                .build();
        System.out.println(hoadon.toString());
    }
}
