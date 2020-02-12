public class Switch {
    public static void main(String[] args) {
        /*
        A+ : 100
        A : 90 - 99
        B : 80 - 89
        C : 70 - 79
        D : 60 - 69
        F : 0 - 59
         */
        // 시험 점수
        int score = 97;

        // 성적적
        String grade;

        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println(grade);
    }
}