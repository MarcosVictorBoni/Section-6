import java.util.Arrays;
import java.util.Scanner;

public class PizzaDeliver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] toppings = new String[3];

        for(int i=0;i<toppings.length;i++){
            System.out.println("Enter the "+(i+1) +" name of the topping in the array");
            toppings[i] = sc.nextLine();
            System.out.println(i +". " +toppings[i]);
        }

        System.out.println();
        System.out.println(Arrays.toString(toppings));
    }
    
}
