class Merchant {
    // firstconstructor
    Merchant(String s, int i) {
        System.out.println("The name of the first merchant is: " + s);
        System.out.println(("The id of the first merchant is: " + i));

    }
    //Overloading of the constructor
    Merchant(String name, int id, int salary) {
        System.out.println("The name of the second merchant is: " + name);
        System.out.println("The id of the second merchant is: " + id);
        System.out.println("The salary of the second merchant is: " + salary);
    }

}

public class constructor {
    public static void main(String[] args) {
        Merchant Uday = new Merchant("Uday", 1);
        Merchant Ayush = new Merchant("Ayush", 2, 81000);
    }
}