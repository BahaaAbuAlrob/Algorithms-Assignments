/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;
import java.util.Scanner;
/**
 *
 * @author baraa
 */
public class Assignment1 {

    
    public static double calculateFact(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result ;
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        
        System.out.println(calculateFact(13694));
    
        double endTime = System.nanoTime();
        double executionTime = endTime - startTime;
        System.out.println("Execution time: "+ executionTime +" nanoseconds");
        
        
    }
    public static double calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
        return n * calculateFactorial(n-1);
        }
    }
    

        // TODO code application logic here
    }
    

