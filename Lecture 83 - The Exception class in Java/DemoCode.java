import java.util.Scanner;

public class DemoCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        if(age>125){
            try{
                // System.out.println(age);
                throw new AgeGreaterException();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else{
            System.out.println(age);
        }
    }
}


class AgeGreaterException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be Greater than 125";
    }
}

