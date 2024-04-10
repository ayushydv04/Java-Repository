public class Try2 {

    public static double area(int r) throws NegativeRadiusException{

        if(r<0){
            throw new NegativeRadiusException();
        }

        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        try{
            double ans = area(-3);
            System.out.println(ans);
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }         
    }
}

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Number cannot be Negative";
    }

    @Override
    public String getMessage(){
        return "Please positive number only";
    }
}

