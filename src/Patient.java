public class Patient {
    private boolean beneficiaries;
    private int age;
    private String fio;
    private String diagnosis;

    Patient(boolean beneficiaries, int age, String fio, String diagnosis) {
        this.beneficiaries = beneficiaries;
        this.age = age;
        this.fio = fio;
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public String getFio() {
        return fio;
    }
}
