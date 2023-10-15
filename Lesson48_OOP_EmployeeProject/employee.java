package Lesson48_OOP_EmployeeProject;

public class employee {
     String name; 
     Double salary; 
     int workHours, hireYear; 

    employee(String name, double salary, int workHours, int hireYear){
        this.name = name; 
        this.salary = salary; 
        this.workHours = workHours; 
        this.hireYear = hireYear; 
    }

    public double tax() {
        if (this.salary < 1000){
            return 0.0; 
        }
        else {
            return 0.03 * salary; 
        }
    }

    public double bonus() {
        int extraHours = this.workHours - 40; 
        if(extraHours > 0){
            return 30 * extraHours; 
        }
        else{
            return 0.0; 
        }
    }

    public double RaiseSalary() {
        int year = 2015 - this.hireYear; 
        if(year < 10){
            return 0.05 * this.salary; 
        }
        else if(year > 10 && year<20){
            return 0.1 * this.salary; 
        }
        else{
            return 0.15 * this.salary; 
        }
    }

    public void toString(employee emp1) {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Year: " + this.hireYear);
        System.out.println("Tax: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Salary Raise: " + this.RaiseSalary());
        System.out.println("Total Salary with Tax and Bonus: " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Total Salary with Raise of Salary: " + (this.salary + this.RaiseSalary()));
    }
}
