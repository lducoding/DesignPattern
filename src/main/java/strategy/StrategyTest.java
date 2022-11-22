package strategy;

public class StrategyTest {

  public static void main(String[] args) {
    Student student1 = new Student("merlin", 91, SubjectClassification.BASIC, "전공과목");
    Student student2 = new Student("merlin", 91, SubjectClassification.MAJOR, "교양과목");

    System.out.println("student1 학점은  " + student1.classifySubject());

    System.out.println("student2 학점은  " + student2.classifySubject());

  }
}
