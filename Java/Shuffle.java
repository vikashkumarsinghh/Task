import java.util.Arrays;
import java.util.Random;

class Shuffle {
    public static void shuffleArr(int arr[]) {
        for (int i = arr.length - 1; i >= 1; i--) {
            Random val = new Random();

            int j = val.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 5, 3, 9 };
        shuffleArr(arr);
        System.out.println("Shuffle Array: " + Arrays.toString(arr));
    }
}