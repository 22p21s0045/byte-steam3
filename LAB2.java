/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Student
 */
public class LAB2 {

    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("Data.dat");
        String s = "Hello world !";
        byte[] b = s.getBytes();
        output.write(b);
        FileInputStream input = new FileInputStream("Data.dat");
        int value;
        while ((value = input.read()) != -1) {
            System.out.print((char) value);

        }
        input.close();

    }
}
