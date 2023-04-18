/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Student
 */
public class LAB3 {
    public static void main(String[] args) throws IOException  {
        FileOutputStream file = new FileOutputStream("data.dat");
        DataOutputStream output = new DataOutputStream(file);
       output.writeUTF("Jim henry");
       output.writeChar('A');
       output.writeInt(30);
       output.writeDouble(65.5);
       output.flush();
       FileInputStream file_in = new FileInputStream("data.dat");
       DataInputStream input = new DataInputStream(file_in);
       String name = input.readUTF();
        System.out.println(name);
        int age;
        age = input.readInt();
        System.out.println(age);
        double height;
        height = input.readDouble();
        System.out.println(height);
    }
    
}
