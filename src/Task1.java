import java.util.Scanner;

public class Task1 {

    public void arrayInput(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("input " + i + " element");
            array[i] = in.nextInt();
        }

    }

    public void arrayOutput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.println("\"" + array[i] + "\"");
            else
                System.out.print("\"" + array[i] + "\"" + " | ");
        }
    }

    public int partition(int[] array, int start, int end) {
        int marker = start;
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                int temp = array[marker]; // swap
                array[marker] = array[i];
                array[i] = temp;
                marker += 1;
            }
        }
        return marker - 1;
    }

    public void quicksort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(array, start, end);
        quicksort(array, start, pivot - 1);
        quicksort(array, pivot + 1, end);
    }

    public static void main(String[] args) {

        int[] array = new int[10];

        Task1 example = new Task1();

        example.arrayInput(array);

        System.out.println("Before sort");
        example.arrayOutput(array);

        example.quicksort(array, 0, array.length - 1);

        System.out.println("After sort");
        example.arrayOutput(array);
    }
}
