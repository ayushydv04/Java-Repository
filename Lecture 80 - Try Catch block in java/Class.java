import java.util.*;

public class Class {

    public static void main(String[] args) {
        // Without try catch

        // int a = 6000;
        // int b = 0;
        // System.out.println(a/b);

        int a = 6000;
        int b = 0;
        // With try catch
        try{
            int c = a/b;
            System.out.println("Result is " + c);
        }
        catch (Exception e){
            System.out.println("Error encountered ");
            System.out.println(e);
        }
    }
}