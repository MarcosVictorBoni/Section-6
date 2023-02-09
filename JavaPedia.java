import java.util.Locale;
import java.util.Scanner;

public class JavaPedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int people = scan.nextInt();
        String[][] database = new String[people][3];

        scan.nextLine(); 
        
         
        
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
        }

        System.out.println("This values you store\n");
        print2DArray(database);

        System.out.println("\n Who do you want information on");
        String name = scan.nextLine();
        System.out.println();
        for(int i=0;i<database.length;i++){
            if(database[i][0].equals(name)){
                System.out.println("\tName:       " +database[i][0]);
                System.out.println("\tBirth Date: " +database[i][1]);
                System.out.println("\tOccupation: " +database[i][2]);
            }
        }

    }

    public static void print2DArray(String[][] array){
        for(int i=0;i<array.length;i++){
            System.out.print("\t");
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.print("\n");
        }
    }

    
}
   
    

