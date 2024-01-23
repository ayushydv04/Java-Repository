import java.util.Scanner;

public class Get {

    public static void main(String[] args) {
        System.out.println("Getting user input");

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Num1");
        int a = sc.nextInt();
        System.out.println("Enter Num2");
        int b = sc.nextInt();

        float c = sc.nextFloat();

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str = sc.next();
        System.out.println(str);


        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
