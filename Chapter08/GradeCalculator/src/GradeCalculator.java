import java.util.ArrayList;

public class GradeCalculator {
    private String name;
    private int credit; // 학점 (ex: 15학점, 18학점...)
    private double score; // 학점 점수 (ex: 4.5, 4.0, 3.5 ...)
    private int thisCredit; // 이번 학점
    private double thisScore; // 학점 점수 총합

    public GradeCalculator(String name, double score, int credit) {
        this.name = name;
        this.score = score;
        this.credit = credit;
    }

    public void addCourse(Course course) {
        thisCredit += course.getCredit();
        thisScore += course.getGrade() * course.getCredit();
    }

    public void print() {
        // 이번 학기 평점
        double thisGrade = thisScore / thisCredit;
        double thisGrade_ = Double.parseDouble(String.format("% .10f", thisGrade));

        //이전학기 평균점수 = score
        //이전학기 크레딧 수 = credit

        // 이전 학기 총 점수
        double beforeSum = score * credit;

        // 이번 학기 총 점수 = thisScore
        // 이번 학기 크레딧 수 = thisCredit

        // 이번 학기 총 점수
        double thisSum = thisGrade * thisCredit;

        // 전체 크레딧
        int totalCredit = credit + thisCredit;

        // 전체 점수
        double totalGrade = (thisSum + beforeSum) / totalCredit;
        double totalGrade_ = Double.parseDouble(String.format("% .10f", totalGrade));



        System.out.println("직전 학기 성적: " + score + " (총 " + credit + "학점)");
        System.out.println("이번 학기 성적: " + thisGrade_ + " (총 " + thisCredit + "학점)");
        System.out.println("전체 예상 학점: " + totalGrade_ + " (총 " + totalCredit + "학점)");
    }
}