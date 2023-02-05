import java.util.ArrayList;
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel" ,"Ellie"};
        String[] staffThisYear = new String[3];
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

        for(int i=0;i<staffLastYear.length; i++){
            staffThisYear[i] = staffLastYear[i];
        }

        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));

        staffThisYear = Arrays.copyOf(staffLastYear, staffThisYear.length);

        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));



        
    }
    
}
