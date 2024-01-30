import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        // String name = new String("Ayush");
        String name = "Ayush";
        System.out.println(name);

        int a = 6;
        float b = 5.6454f;
        // System.out.printf("The value of a is %d and value of b is %f", a,b);
        
        //To print upto two decimal places only
        // System.out.printf("The value of a is %d and value of b is %.2f", a,b);

        //To take string input
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

    }
}