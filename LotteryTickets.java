import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 ={};

        ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;
        System.out.println(Arrays.toString(ticket2));
        System.out.println();
        printTicketsNumber(ticket);
        printTicketsNumber(ticket2);        
    
    }

    public static void printTicketsNumber(int[] ticket){
        for(int i=0;i<ticket.length;i++){
            System.out.print(ticket[i] +" \n\n");
        }

    }
    
}
