/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author FPT
 */
public class Main {
    public static void main(String[] args){   
        MyStringBuilder str = new MyStringBuilder.Builder()
                                .addString("Nguyễn Văn Ánh")
                                .addFloat((float)0.9 )
                                .addBoolean(Boolean.FALSE)
                                .build();
        
        System.out.println(str.toString());
    }
}
