/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;
import java.util.Scanner;
/**
 *
 * @author dzaka
 */
public class Strings {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int sum = A.length() + B.length();
        System.out.println(sum);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }

}
