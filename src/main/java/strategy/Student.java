package strategy;

public class Student {

    private String name;
    private int score;
    private SubjectClassification subjectClassification;
    private String subjectName;

    public Student(String name, int score, SubjectClassification subjectClassification,
        String subjectName) {
        this.name = name;
        this.score = score;
        this.subjectClassification = subjectClassification;
        this.subjectName = subjectName;
    }

    public String classifySubject() {
        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};
        if(subjectClassification.equals(SubjectClassification.BASIC)) {
            return gradeEvaluation[0].showGrade(score);
        } else if (subjectClassification.equals(SubjectClassification.MAJOR)) {
            return gradeEvaluation[1].showGrade(score);
        }
        return "subjectClassification error";
    }
}
