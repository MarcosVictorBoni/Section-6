import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];
        int[][] grades2 = {
            {72,74,76,78},
            {65,64,61,67},
            {72,98,99,100}
        };
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 76;
        grades[0][3] = 78;

        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;

        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        System.out.println("\tHarry   :" +Arrays.toString(grades[0]));
        System.out.println("\tRon     :" +Arrays.toString(grades[1]));
        System.out.println("\tHermine :" +Arrays.toString(grades[2]));

        System.out.println("\tHarry   :" +grades2[0][0] +" " +grades2[0][1] +" " +grades2[0][2] +" " +grades2[0][3]);
        System.out.println("\tRon     :" +grades2[1][0] +" " +grades2[1][1] +" " +grades2[1][2] +" " +grades2[1][3]);
        System.out.println("\tHermine :" +grades2[2][0] +" " +grades2[2][1] +" " +grades2[2][2] +" " +grades2[2][3]);

        for(int j=0;j<grades2[0].length;j++){
            System.out.print(" " +grades2[0][j]);
        }

        System.out.println();

        for(int j=0;j<grades2[1].length;j++){
            System.out.print(" " +grades2[1][j]);
        }

        System.out.println();

        for(int j=0;j<grades2[2].length;j++){
            System.out.print(" " +grades2[2][j]);
        }


    }
    
}
