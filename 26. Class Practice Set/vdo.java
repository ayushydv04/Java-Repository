import java.util.Scanner;
/**
 * Employee
 */
class Employee {

    int salary;
    String name;
    public int getSalary(){
        return salary;
    } 

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class cellPhone{

    public void getRing(){
        System.out.println("Ringing...");
    }

    public void getVibrating(){
        System.out.println("Vibrating...");
    }

    public void getCalling(){
        System.out.println("Calling Friend...");
    }
}



public class vdo{
    public static void main(String[] args) {
        Employee ayush = new Employee();
        ayush.setName("Ayush Yadav");
        ayush.salary = 45;
        System.out.println(ayush.getName());
        System.out.println(ayush.getSalary());

    }
}