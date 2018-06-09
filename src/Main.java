import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nurse masha = new Nurse("Masha");

        Patient[] array = new Patient[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = masha.inputPatient();
        }
        masha.outputPatient(array);

        System.out.println("You can find a patient by name or age.\nPlease enter \"name\" or \"age\".");
        Scanner in = new Scanner(System.in);
        String menuElement = in.nextLine();
        switch (menuElement) {
            case "name":
                masha.findByName(array);
                break;
            case "age":
                masha.findByAge(array);
                break;
            default:
                System.out.println("You may have entered an incorrect value");
        }
    }
}