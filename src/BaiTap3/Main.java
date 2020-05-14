/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author FPT
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shape1 = ShapeFactory.createInstance();
    
        shape1.setType(ShapeType.Circle);
        System.out.println("Hình 1: "+shape1.getType());
        
        shape1.setType(ShapeType.Rectangle);
        System.out.println("Hình 2: "+shape1.getType());
        
        shape1.setType(ShapeType.Triangle);
        System.out.println("Hình 3: "+shape1.getType());
        
    }
}
