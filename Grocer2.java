import java.util.Scanner;

public class Grocer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("What do you want we hava (apples, bananas, candy, chocolate, coffee, tea) write on of this options");
        String request = sc.nextLine();
        for(int i=0;i<aisle.length;i++){
            System.out.println(i);
            if(aisle[i].equals(request)){
                System.out.println("We have in aisle index " +i);
                break;
            }
        }

    }
    
}
