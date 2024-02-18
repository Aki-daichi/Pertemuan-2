/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CampusScenario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dzaka
 */

public class campus {
    // Daftar mahasiswa yang terenkapsulasi
    private List<student> students;

    // Konstruktor
    public campus() {
        students = new ArrayList<>();
    }

    // Metode untuk mendapatkan jumlah mahasiswa
    public void addStudent(student student) {
        students.add(student);
    }

    // Metode utama untuk menunjukkan interaksi antara Kampus dan Mahasiswa
    public int getStudentCount() {
        return students.size();
    }

    // Main method untuk menunjukkan interaksi antara Kampus dan Mahasiswa
    public static void main(String[] args) {
        // Membuat objek kampus
        campus campus = new campus();

        // Menambahkan mahasiswa ke kampus
        campus.addStudent(new student("Budi", "Dudidam", 1));
        campus.addStudent(new student("Ana", "Nanina", 2));

        // Tampilkan jumlah mahasiswa di kampus
        System.out.println("Number of students in the campus: " + campus.getStudentCount());
       
        // Cetak nama-nama mahasiswa
        System.out.println("Names of the students:");
        for (student student : campus.students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}
