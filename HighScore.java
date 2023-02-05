import java.util.Random;

public class HighScore {
    public static void main(String[] args) {
        int[] random = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        for(int i=0;i<random.length;i++){
            System.out.println("Here are the elements " +random[i] +" ");
        }
        int highScore = random[0];
        for(int i=0;i<random.length;i++){
            System.out.print(random[i] +" ");
            if(random[i] > highScore){
                highScore = random[i];
            }
        }
        System.out.println("\nHigh score is "+highScore);
    }

    public static int randomNumber(){
        double result = Math.random() * 50000;
        return (int)result;
    }
    
}
