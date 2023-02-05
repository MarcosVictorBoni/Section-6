import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        double[][] Prices = new double[3][5];
        double[][] Prices2 = {
            {12.99,8.99,9.99,10.49,11.99},
            {0.99,1.99,2.49,1.99,2.99},
            {9.99,7.99,9.49,9.99,10.49}
        };
        Prices[0][0] = 12.99;
        Prices[0][1] = 8.99;
        Prices[0][2] = 9.99;
        Prices[0][3] = 10.49;
        Prices[0][4] = 11.99;

        Prices[1][0] = 0.99;
        Prices[1][1] = 1.99;
        Prices[1][2] = 2.49;
        Prices[1][3] = 1.99;
        Prices[1][4] = 2.99;

        Prices[2][0] = 9.99;
        Prices[2][1] = 7.99;
        Prices[2][2] = 9.49;
        Prices[2][3] = 9.99;
        Prices[2][4] = 10.99;

        System.out.println("\t   Baking: " +Arrays.toString(Prices[0]));
        System.out.println("\tBevereges: " +Arrays.toString(Prices[1]));
        System.out.println("\t  Cereals: " +Arrays.toString(Prices[2]));

        System.out.println();

        System.out.println("\t   Baking: " +Prices2[0][0] +" " +Prices2[0][1] +" "+Prices2[0][2] +" " +Prices2[0][3] +" " +Prices2[0][4]);
        System.out.println("\tBevereges: " +Prices2[1][0] +" " +Prices2[1][1] +" "+Prices2[1][2] +" " +Prices2[1][3] +" " +Prices2[1][4]);
        System.out.println("\t  Cereals: " +Prices2[2][0] +" " +Prices2[2][1] +" "+Prices2[2][2] +" " +Prices2[2][3] +" " +Prices2[2][4]);
    }
    
}
