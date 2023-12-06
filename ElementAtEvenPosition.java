package Day3_ArrayList_PP;

public class ElementAtEvenPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 10, 2, 2, 5, 1};
        System.out.println("Element at even position");
        for (int i = 1; i < arr.length; i=i+2)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
