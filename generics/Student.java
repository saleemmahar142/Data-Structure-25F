/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author Muhammad Saleem
 */
public class Student {
    int id;
    String name;
    String dpt;

    public Student(int id, String name, String dpt) {
        this.id = id;
        this.name = name;
        this.dpt = dpt;
    }

    @Override
    public String toString() {
        return "ID:"+id+" | "+
        "Name:"+name+" | "+
        "Department:"+dpt;
    }
    
}
