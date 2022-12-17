import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 1, 24, 12};

        for (int i : array) {
            BubbleSort.bubbleSort(array);
        }
        System.out.println(Arrays.toString(array));
    }
}
