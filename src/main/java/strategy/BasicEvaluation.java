package strategy;

public class BasicEvaluation implements GradeEvaluation{

    @Override
    public String showGrade(int score) {

        if(score >= 90 && score <= 100) {
            return "A+";
        } else if (score >= 80 && score <= 89) {
            return "B+";
        } else if (score >= 60 && score <= 79) {
            return "C+";
        } else if (score >= 40 && score <= 59) {
            return "D+";
        } else {
            return "F";
        }
    }
}
