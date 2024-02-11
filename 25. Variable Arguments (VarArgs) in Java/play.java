public class play{

    static int add(int x, int ...arr){ //x here is mandatory argument
        int sum = x;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(3,5,6,7,8,9));
    }
}