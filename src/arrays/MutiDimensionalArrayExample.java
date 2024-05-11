package arrays;
public class MutiDimensionalArrayExample {
    public static void main(String[] args) {
        int[][] mutiArray = new int[2][2];
        int dataArray[][] = {
            {1,2,3},
            {3,4,5},
            {6,7,8}
        };
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++ ){
                System.out.println(dataArray[i][j] + "\t");
            }
        };

    }
}