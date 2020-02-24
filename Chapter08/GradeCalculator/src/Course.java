public class Course {
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    private String subject;
    private int credit;
    private String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double getGrade() {
        switch (grade) {
            case "A+":
                return 4.5;
                //break

            case "A":
                return 4.0;

            case "B+":
                return 3.5;

            case "B":
                return 3.0;

            case "C+":
                return 2.5;

            case "C":
                return 2.0;

            case "D+":
                return 1.5;

            case "D":
                return 1.0;
                
        } return 0.0; // F일 경우
    }

    public double getCredit() {
        return credit;
    }

}