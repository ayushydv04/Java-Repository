public class MultidimenArr {

    public static void main(String[] args) {
        // How to make a 2-D array
        int [][] flats = new int [2][3];

        // ANother way of making a 2-D array
        // int [][] flats;
        // flats = new int[2][3];

        // To add elements in a 2-D array
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 103;
        flats[1][1] = 104;
        flats[1][2] = 105;

        // To print 2-D array using for loop
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println("");
        }


    }
}