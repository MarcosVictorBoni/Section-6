import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheith = celsiusToFahrenheith(celsius);
        System.out.println("The temperature in Celsius is \n"+Arrays.toString(celsius) +"\n the temperature converted in fahrenheigth is \n" +Arrays.toString(fahrenheith)); 
    }

    public static double[] celsiusToFahrenheith(double[] celsius){
        double[] fahrenheith = new double[celsius.length]; 
        for(int i=0;i<fahrenheith.length;i++){
            fahrenheith[i] = (celsius[i]/5 * 9) + 32;
        }
        return fahrenheith;

    }
    
}
