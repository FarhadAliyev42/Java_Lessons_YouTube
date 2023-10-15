public class MultidimensionalArrays {
    public static void main(String[] args){
        // DataType[][] ArrayName = new DataType[][]; 
        int[][] table = new int[][]{
            {1,75,10}, {2,87,13}, {3,95,15}, {4,103,18}, {5,110,19} 
        };

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(table[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("-----------");

        // foreach 
        for(int[] cl: table){
            for(int value: cl){
                System.out.print(value + " ");
            }
            System.out.println(" ");
        }
    }
}
