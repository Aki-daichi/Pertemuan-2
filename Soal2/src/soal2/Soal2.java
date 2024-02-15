/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

/**
 *
 * @author dzaka
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca jumlah test case
        System.out.println("Masukkan jumlah kasus uji yang akan dilakukan: ");
        int T = scanner.nextInt();
        scanner.nextLine(); // Membuang newline
        
        // ArrayList untuk menyimpan input n dari setiap test case
        ArrayList<BigInteger> testCases = new ArrayList<>(); // Ubah  ArrayList type
        
        // Membaca input untuk setiap test case
        System.out.println("\nMasukkan angka: ");
        for (int i = 0; i < T; i++) {
            BigInteger n = scanner.nextBigInteger(); // Use nextBigInteger() untuk membaca BigInteger
            testCases.add(n);
        }
        
        // Proses test cases
        for (int i = 0; i < T; i++) {
        BigInteger n = testCases.get(i);
        // Lakukan penge-checkan dengan nilai n dari test case ke-i
        
        if (n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) > 0 && n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) > 0 
            && n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0
            || n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) < 0 && n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) < 0 
            && n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0 && n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
            System.out.println(n + " can't be fitted anywhere.");
		
        }else{ 
            System.out.println( n + " can be fitted in");   
            }   
            
        if (n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                System.out.println("* byte");
            }
        if (n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                System.out.println("* short");
            }
        if (n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                System.out.println("* int");
            }
        if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                System.out.println("* long");
            }
        scanner.close();
        }
    }
}

/* Output:
    15 can be fitted in
    * byte
    * short
    * int
    * long
    -150 can be fitted in
    * short
    * int
    * long
    150000 can be fitted in
    * int
    * long
    1500000000 can be fitted in
    * int
    * long
    213333333333333333333333333333333333 can't be fitted anywhere.
    -100000000000000 can be fitted in
    * long
*/