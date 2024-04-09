import java.util.Scanner;

public class Handle{
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 6;
        marks[1] = 54;
        marks[2] = 9;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index ");
        int ind = sc.nextInt();
        
        System.out.println("Enter the no you want to divide value with ");
        int num = sc.nextInt();

        try{
            System.out.println("The value at index entered is " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException encountered");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException encountered");
            System.out.println(e);
        }
        
        // catch (Exception e){
        //     System.out.println("Error encountered");
        //     System.out.println(e);
        // }
    }
}