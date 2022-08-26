/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cutshapes;

import data.Disk;
import data.Rectangle;
import data.RightTriangle;
import data.Square2;
import data.Triangle;

/**
 *
 * @author User
 */
public class CutShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cutShapess();
        //sortShapes();
        //playWithChildClass();
        playwithTriangle();

    }

    public static void playwithTriangle() {
        Triangle t1 = new Triangle("Tia", "Pink", 3, 4, 5);
        t1.paint();

        RightTriangle rt1 = new RightTriangle("Ma", "Pink", 6, 8);
        rt1.paint();

    }

    public static void playWithChildClass() {
        Square2 s1 = new Square2("Tia", "Yellow", 4.0);
        s1.paint();

    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("Tia", "Pink", 1.0, 2.0);

        Rectangle rectArr[] = new Rectangle[9];

        rectArr[0] = r1;
        rectArr[0].paint();
        rectArr[0].setOwner("Yeu Tia");
        r1.paint();
        rectArr[1] = new Rectangle("Ma", "Pink", 3.0, 4.0);
        rectArr[2] = new Rectangle("A.Hai", "blue", 3.0, 3.0);

        System.out.println("The list of rectangle");
//        for (Rectangle x : rectArr) {
//            x.paint();
//        }
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

        // sort tang dan
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }

            }

        }
        System.out.println("After sorting ascending by area");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
    }

    public static void cutShapess() {
        Rectangle r1 = new Rectangle("Tia", "Pink", 1.0, 2.0);
        r1.paint();

        Square2 s1 = new Square2("Ma", "Red", 5.0);
        s1.paint();

        Disk d1 = new Disk("Be Na", "Rainbow", "<3", 2.0);
        d1.paint();
    }
}
