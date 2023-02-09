public class Arrays2DNestedLoops {
    int[][] nAleatorio = new int[100][10];
    public static void main(String[] args) {
        int[][] array = new int[100][10];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = randomNumbers();
            }
        }

        print2DArrays(array);
    }

    public static int randomNumbers(){
        double number = Math.random() * 100;
        return (int)number;
        
    }

    public static void print2DArrays(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }

    }
    
}
