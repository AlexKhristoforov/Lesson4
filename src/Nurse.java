import java.util.Scanner;

public class Nurse {
    private String name;

    Nurse(String name) {
        this.name = name;
    }

    public Patient inputPatient() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input fio");
        String fio = in.nextLine();
        System.out.println("Input age");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("input diagnosis");
        String diagnosis = in.nextLine();
        System.out.println("beneficiaries");
        boolean beneficiaries = in.hasNextBoolean();

        Patient example = new Patient(beneficiaries, age, fio, diagnosis);
        return example;
    }

    public void outputPatient(Patient[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Patient \"" + array[i].getFio() + "\" - " + "Age = \"" + array[i].getAge() + "\"");
        }
    }

    public void findByAge(Patient[] array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Age");
        int age = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (age == array[i].getAge())
                System.out.println("Patient \"" + array[i].getFio() + "\" - " + "Age = \"" + array[i].getAge() + "\"");
        }
    }

    public void findByName(Patient[] array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Name");
        String name = in.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getFio()))
                System.out.println("Patient \"" + array[i].getFio() + "\" - " + "Age = \"" + array[i].getAge() + "\"");
        }
    }
}