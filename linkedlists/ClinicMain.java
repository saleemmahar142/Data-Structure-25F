/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Muhammad Saleem
 */
public class ClinicMain {
    public static void main(String[] args) {
        
        Clinic recep = new Clinic();
        int issueTokenNo = 0;
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.issueToken(++issueTokenNo,"ABCD", 22, "Dr. Ali");
        recep.displayPatients();
        
    }
}
