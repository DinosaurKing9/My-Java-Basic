/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author User
 */
public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    }
    
    @Override
    public void paint() {
        System.out.printf("|RIGHT TRIANGLE|%-15s|%-10s|%4.1f|%4.1f|%4.1f|%5s|\n", owner, color, a, b, c, getArea());
    }
}
