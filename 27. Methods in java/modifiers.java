class MyEmployee{
    private int id;
    private String name;

    //Making a getter to return the value
    public String getName(){
        return name;
    }

    //Making a setter to update the value
    public void setName(String n){
        name = n;
    }

    //Making a setter for taking value of id
    public void setId(int i){
        id = i;
    }


    //Making a Getter to take return value for id
    public int getId(){
        return id;
    }

}

public class modifiers {
    public static void main(String[] args) {
        MyEmployee Arr = new MyEmployee();

        Arr.setName("Code with Uday");
        Arr.setId(244);

        System.out.println(Arr.getName());
        System.out.println(Arr.getId());
    }
    
}
