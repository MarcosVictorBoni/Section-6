import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        double tax = 0.13;
        for(int i=0;i<price.length;i++){
            price[i] += price[i] * tax;
        }
        System.out.println(Arrays.toString(price));
    }
    
}
