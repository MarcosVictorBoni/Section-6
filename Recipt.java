public class Recipt {
    public static void main(String[] args) {
        String[] apple = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {1.99, 1.49, 1.29};
        for(int i=0;i<apple.length;i++){
            System.out.println(apple[i] +": $" +prices[i]);
        }
    }
    
}
