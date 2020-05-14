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
public class ShapeFactory {
     public static ShapeFactory instance;
    
    ShapeType Type ;

    public ShapeType getType() {
        return Type;
    }

    public void setType(ShapeType Type) {
        this.Type = Type;
    }
   
    public static ShapeFactory createInstance(){
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    
    public Shape createShape(){
         return null;
        
    } 
}