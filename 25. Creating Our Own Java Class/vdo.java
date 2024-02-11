
/**
 * Employee
 */
class Employee {

    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and name is " + name);
        // System.out.println("and salary is " + salary);
    }

    public int getSalary(){
        return salary;
    }
}



public class vdo {

    public static void main(String[] args) {
        System.out.println("Making first class");

        Employee harry = new Employee();
        harry.id = 1001;
        harry.salary = 45;
        harry.name = "Ayush";

        // System.out.println(harry.id);
        // System.out.println(harry.name);

        // To print using a method
        harry.printDetails();

        // Making one more class
        Employee john = new Employee();
        john.id = 1002;
        john.salary = 40;
        john.name = "John Khadelwal";
        john.printDetails();
        int salary = john.getSalary();
        System.out.println("Salary is " + salary);

    }
}