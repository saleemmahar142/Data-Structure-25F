/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author Muhammad Saleem
 */
public class Student {
    int id;
    String name;
    String reason;
    int urgency;

    public Student(int id, String name, String reason, int urgency) {
        this.id = id;
        this.name = name;
        this.reason = reason;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "ID: "+id+
                "\nName:    "+name+
                "\nProblem/Reason:  "+reason+
                "\nRule Based Value:    "+urgency;
    }
    
}
