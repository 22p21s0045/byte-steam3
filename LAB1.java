/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

/**
 *
 * @author Student
 */
public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator red_shape = new RedShapeDecorator(circle);
        red_shape.draw();
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator rectangle_Decorator = new RedShapeDecorator(rectangle);
        rectangle_Decorator.draw();
       
    }
    
}
