/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jd522_ga6_q1;

/**
 *
 * @author Devon
 */
public class Student {
public static void main(){}
/*Declaration of variables*/

int studentID;
double credithours, points,gradePointAve;

//Constructor
Student(int id,double hours,double p)
{
studentID=id;
credithours=hours;
points=p;
}

/*Getters and Setters*/
void setStudentID(int id)
{
    studentID=id;
}
void setCreditHours(double hours)
{
    credithours=hours;
}
void setPointsEarned(double poEar)
{
    points=poEar;
}
int getStudentID()
{
    return studentID;
}
double getCreditHours()
{
    return credithours;
}
double getPointsEarned()
{
    return points;
}

//Method to calculate the grade point average
double computeGradePointAverage()
{
    return points/credithours;
}

//Methods to display values
void displayIDNumber()
{
    System.out.println("ID Number:"+ studentID);
}
void displayCreditHours()
{
    System.out.println("Number of credit hours earned:"+ credithours);
}
void displayPointsEarned()
{
    System.out.println("Number of points earned:"+ points);
}
}