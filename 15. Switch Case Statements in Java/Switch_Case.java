import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();

        // switch (age) {
        //     case 18:
        //         System.out.println("Age is 18");
        //         break;
        //     case 21:
        //         System.out.println("Age is 21");
        //         break;
        //     case 30:
        //         System.out.println("Age is 30");
        //         break;

        //     default:
        //         System.out.println("Age is default");
        //         break;
        // }

        //Enhanced Switch Case
        switch (age) {
            case 18 -> {
                        System.out.println("Age is 18");
                        System.out.println("Age is 18.1");
                        System.out.println("Age is 18.5");
        }
            case 21 -> System.out.println("Age is 21");
                
            case 30 -> System.out.println("Age is 30");

            default -> System.out.println("Age is default");
            
        }


    }
}