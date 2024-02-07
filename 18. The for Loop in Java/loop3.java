public class loop3{
    public static void main(String[] args) {
        System.out.println("For Loop");

        for (int itr = 1; itr < 5; itr++) {
            System.out.println(itr);
        }
        
        // Print n odd numbers
        System.out.println("Print n odd numbers");
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(2*i+1);
        }
        
        // Print Reverse numbers till 0
        System.out.println("Print Reverse numbers till 0");
        for (int i = 7; i != -1; i--){
            System.out.println(i);
        }

    }

}