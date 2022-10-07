/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jd522_ga6_q1;

/**
 *
 * @author Devon
 */
public class ShowStudent {
    
//Main method
public static void main(String[] args)
{
/*Object definition with values*/
Student obj=new Student(9999, 3, 12);
//Print the details
System.out.println("Student Details");
obj.displayIDNumber();
obj.displayCreditHours();
obj.displayPointsEarned();
System.out.println("Average Grade Point is:"+ obj.computeGradePointAverage());
}
}
