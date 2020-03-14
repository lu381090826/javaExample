package sort;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 6, 7, 3, 3, 2, 8, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1- i; j++) {
                if (arr[j+1] < arr[j]) {
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
            }
        }
        System.out.println(arr);
    }
}
