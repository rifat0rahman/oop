package today;

// Interface for MCQ
interface MCQExam {
    void evaluateScore(int correct, int wrong);
}

// Interface for Penalty
interface Penalty {
    double calculatePenalty(int wrong);
}

// Base class implementing both interfaces
class ExamResult implements MCQExam, Penalty {
    double score;

    public void evaluateScore(int correct, int wrong) {
        score = correct * 1.0;   // 1 mark per correct answer
        System.out.println("Score without penalty: " + score);
    }

    public double calculatePenalty(int wrong) {
        return wrong * 0.25;     // 0.25 penalty per wrong answer
    }
}

// Sub-class applying penalty
class PenaltyExam extends ExamResult {

    @Override
    public void evaluateScore(int correct, int wrong) {
        double penalty = calculatePenalty(wrong);
        score = correct * 1.0 - penalty;
        System.out.println("Penalty: " + penalty);
        System.out.println("Final Score: " + score);
    }
}

// Main class
public class UniversityMCQExam {
    public static void main(String[] args) {
        PenaltyExam exam = new PenaltyExam();
        exam.evaluateScore(20, 4);
    }
}
