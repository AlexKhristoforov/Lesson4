import java.util.Scanner;

public class Task2 {
    public int numberOfPages(int number) {
        int count = number / 10;
        int rest = number % 10;
        if (rest > 0)
            count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int count = in.nextInt();

        Task2 example = new Task2();

        int finalCount = example.numberOfPages(count);
        System.out.println("Pages = " + finalCount);
    }
}


