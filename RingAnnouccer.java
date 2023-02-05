public class RingAnnouccer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        for(int i=0;i<record.length;i++){
            if(record[i].equalsIgnoreCase("win")){
                wins++;
            }else
                losses++;
        }

        System.out.println("Here is the record of " +wins +" and " +losses +" losses");
    }
    
}
