/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CampusScenario;

/**
 *
 * @author dzaka
 */

public class student {
    // Atribut yang terenkapsulasi
    private String firstName;
    private String lastName;
    private int id;

    // Konstruktor
    public student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Getter untuk first name
    public String getFirstName() {
        return firstName;
    }

    // Getter untuk last name
    public String getLastName() {
        return lastName;
    }

    // Getter untuk ID
    public int getId() {
        return id;
    }
}
