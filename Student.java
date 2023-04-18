/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

import java.io.Serializable;

/**
 *
 * @author Student
 */
public class Student implements Serializable {
    String id;
    String name;
    public Student(String id,String name){
        this.name = name;
        this.id = id;
        
    }
    
}
