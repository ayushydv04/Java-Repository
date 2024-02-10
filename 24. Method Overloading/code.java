public class code {


    static void greet(){
        System.out.println("Good Morning!");
    }

    static void greet(int a){
        System.out.println("Good Morning! " + a);
    }

    // static void greet(int a, int b){
    //     System.out.println("Good Morning! " + a);
    //     System.out.println("Good Morning! " + b);
    // }
    // static void greet(int a, int b, int c){
    //     System.out.println("Good Morning! " + a);
    //     System.out.println("Good Morning! " + b);
    //     System.out.println("Good Morning! " + c);
    // }
    // static void greet(int a, int b, int c, int d){
    //     System.out.println("Good Morning! " + a);
    //     System.out.println("Good Morning! " + b);
    //     System.out.println("Good Morning! " + c);
    //     System.out.println("Good Morning! " + d);
    // }

        static void change(int a){
            a = 66;
        }

        static void change2(int [] arr){
            arr[0] = 96;
        }

    public static void main(String[] args) {

  // Method Overloading
        // greet();
        // greet(20);
        // greet(20, 55);
        // greet(20, 86, 99);
        // greet(20, 23, 67, 678);

        // case 1 -> Changing the int a
        // int x = 45;
        // change(x);
        // System.out.println("Change is " + x);

        // case 2 -> Changing the array
        int []marks = {45, 65, 76, 94};
        change2(marks);
        System.out.println("Change is " + marks[0]);
    }
}