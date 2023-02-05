public class HighScoreIndex {
    public static void main(String[] args) {
        int[] random = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        for(int i=0;i<random.length;i++){
            System.out.println("Here are the elements " +random[i] +" ");
        }
        int highScore = random[0];
        int index = 0;
        for(int i=0;i<random.length;i++){
            System.out.print(random[i] +" ");
            if(random[i] > highScore){
                highScore = random[i];
                index = i;
            }
        }
        System.out.println("\nHigh score is "+highScore);
        System.out.println("The position or index is "+index);
    }

    public static int randomNumber(){
        double result = Math.random() * 50000;
        return (int)result;
    }
    
    
}
