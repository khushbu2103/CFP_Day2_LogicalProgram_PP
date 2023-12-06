package Day3_ArrayList_PP;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 2, 8, 3, 10, 2, 2, 5, 3};
        int min = arr[1];
        //int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) //2
                min = arr[i];

        }
        System.out.println("Smallest element: " + min);
    }
}
