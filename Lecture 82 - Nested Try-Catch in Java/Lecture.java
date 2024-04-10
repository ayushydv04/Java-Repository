import java.util.Scanner;

public class Lecture {

    public static void main(String[] args) {
        int []marks = new int[3];
        marks[0] = 6;
        marks[1] = 67;
        marks[2] = 9;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
        while(flag){
            
            System.out.println("Enter value of index");
            int ind = sc.nextInt();
            try{
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index not present");
                    System.out.println("Exception in lvl 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception in lvl 1");
            }
        }
    }
}