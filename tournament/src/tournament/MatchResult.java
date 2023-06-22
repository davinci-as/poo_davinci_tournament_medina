package tournament;

public class MatchResult {
    private int localGoalCounter;
    private int visitantGoalCounter;

    public MatchResult() {

    }

    public int getLocalGoalCounter() {
        return localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }

    public int getVisitantGoalCounter() {return visitantGoalCounter;
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }
}
