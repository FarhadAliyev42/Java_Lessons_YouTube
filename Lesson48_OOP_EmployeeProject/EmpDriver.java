package Lesson48_OOP_EmployeeProject;

import java.util.Scanner;

public class EmpDriver{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String Name = s.nextLine();
        double salary = s.nextDouble();
        int workHours = s.nextInt();
        int hireYear = s.nextInt();
        s.close();
        employee emp1 = new employee(Name, salary, workHours, hireYear); 
        emp1.toString(emp1);
    }
}
