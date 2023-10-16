package Lesson56_OOP_usageOfStatic;

public class Main {
    public static void main(String[] args){
        System.out.println("Online Students: " + Student.howStudent());
        Student s1 = new Student("Ali", 152, 90);
        Student s2 = new Student("Ahmet", 123, 100);
        Student s3 = new Student("Jack", 172, 99); 
        System.out.println("Online Students: " + Student.howStudent());
        s1.exit(); 
        System.out.println("Online Students: " + Student.howStudent());
        int[] grades = new int[3]; 
        grades[0] = s1.point; 
        grades[1] = s2.point; 
        grades[2] = s3.point; 
        System.out.println(Student.calcOverall(grades));
    }
}
