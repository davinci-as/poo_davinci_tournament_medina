package tournament;

public class MatchResult {

    public boolean localWin(){
        if (localGoalCounter>visitantGoalCounter){
            return true;
        } else {
            return false;
        }
    }

    public boolean tie(){
        if (localGoalCounter==visitantGoalCounter){
            return true;
        } else {
            return false;
        }
    }

    public String getWinner (){
        if (localWin()==true){
            return localTeam;
        } else if (tie()==true){
            return "Empate";
        } else {
            return visitantTeam;
        }
    }
}
