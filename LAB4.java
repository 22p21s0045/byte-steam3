/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Student
 */
public class LAB4 {

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("data.dat");

        BufferedOutputStream output = new BufferedOutputStream(file);
        
        String s = "Hello world";
        byte[]b = s.getBytes();
        output.write(b);
        output.close();
        FileInputStream input_file = new FileInputStream("data.dat");
        BufferedInputStream input = new BufferedInputStream(input_file);
        int ch;
        while((ch=input.read())!= -1){
            System.out.print((char)ch);
        }
        
    }

}
