package arrays;
public class SingleDimensionalArrayExample {
    public static void main(String[] arg) {
        int[] dataArray = new int[] {1, 2, 3, 4, 5};
        System.out.println("*********************************");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(dataArray[i]);
        }

        for (int data : dataArray) {
            System.out.println(data);
        }

        System.out.println("Print Array: " + dataArray);
    }
}