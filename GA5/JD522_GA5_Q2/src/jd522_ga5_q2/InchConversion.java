/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jd522_ga5_q2;

import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class InchConversion {

    public static void feetConversion(double inches)
    {
         double feet = inches * 12;
         System.out.println("Inches converted to feet = " + feet);
    }
    public static void yardsConversion(double inches)
    {
            double yards = inches * 36;
            System.out.println("Inches converted to yards = " + yards);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try
        {
            //Scanner for input
            Scanner x = new Scanner(System.in);   
            
            System.out.print("Please enter number in Inches for conversion:");            
            double inches = x.nextDouble();  
            feetConversion(inches);
            yardsConversion(inches);
        }
        catch(Exception ex)
        {
            return;
        }
    }
    
}
