package strategy;

public class MajorEvaluation implements GradeEvaluation{

    @Override
    public String showGrade(int score) {
        if(score >= 95 && score <= 100) {
            return "A+";
        } else if (score >= 90 && score <= 94) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B+";
        } else if (score >= 70 && score <= 79) {
            return "B";
        } else if (score >= 40 && score <= 69) {
            return "C+";
        } else {
            return "F";
        }
    }
}
