/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author User
 */
public class Square2 extends Rectangle {

    public Square2(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }  
    
//    private String owner;
//    private String color;
//    private double edge;
    
    @Override 
    public void paint() {
        System.out.printf("|SQUARE  |%-15s|%-10s|%4.1f|%10f|\n", owner, color, width ,getArea());
    }
}
