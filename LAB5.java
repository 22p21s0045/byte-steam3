/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Student
 */
public class LAB5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       FileOutputStream file = new FileOutputStream("data.dat");

        Student s = new Student("111","Henry");
        ObjectOutputStream output = new ObjectOutputStream(file);
        output.writeObject(s);
        output.close();
        FileInputStream input_file = new FileInputStream("data.dat");
        ObjectInputStream input_obj = new ObjectInputStream(input_file);
        Student s1 = (Student) input_obj.readObject();
        System.out.println(s1.id);
        System.out.println(s1.name);
        

    }
}
