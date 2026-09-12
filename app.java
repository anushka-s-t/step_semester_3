class Applicant {
    static int totalApplicants = 0;

    public Applicant() {
        totalApplicants++;
    }
}

public class app {
    public static void main(String[] args) {
        Applicant appl1 = new Applicant();
        Applicant appl2 = new Applicant();
        Applicant appl3 = new Applicant();

        // Accessing the static field directly through the class name
        System.out.println("Total applicants: " + Applicant.totalApplicants);
    }
}