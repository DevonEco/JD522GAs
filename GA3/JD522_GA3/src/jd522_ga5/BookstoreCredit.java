/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jd522_ga5;
import java.util.*;
/**
 *
 * @author Devon
 */
public class BookstoreCredit {

    public static void creditCal(String s_name, double grade){
      
      double credit = grade*10;
      System.out.println(s_name +"\'s average grade is "+ grade + " and given Credits is R" + credit);
    
    }
// main method of the class
public static void main (String[] args) throws java.lang.Exception
{
   try{
    // scanner object to read innput
       Scanner s=new Scanner(System.in);
        // variables
      String s_name;
      double grade;

      System.out.print("Please enter the name:");

      s_name=s.nextLine();

      System.out.print("Please enter the grade point:");

      grade = s.nextDouble();
      creditCal(s_name, grade);     

   }catch(Exception ex){

       return;}
}
}
