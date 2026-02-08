package today.LabFinal;

class examEvaluation implements ExamDesign, penaltyDesign {
    public double score;

    public double evaluateScore(int correct, int wrong) {
        score = correct * 1.0;
        return score;
    }

    public double calculatePenalty(int wrong) {
        return wrong * 0.25;
    }
}

class FinalResult extends examEvaluation {
    public double evaluateScore(int correct, int wrong) {
        double penalty = calculatePenalty(wrong);
        double result = correct * 1.0 - penalty;
        System.out.println("Penalty: " + penalty);
        System.out.println("Final Score: " + result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        FinalResult ob = new FinalResult();
        ob.evaluateScore(16, 4);
    }
}
