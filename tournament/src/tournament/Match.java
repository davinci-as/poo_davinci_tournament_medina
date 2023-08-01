package tournament;

import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private static Team localTeam;
    private static Team visitantTeam;
    private static MatchResult result;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static Team getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(Team localTeam) {
        this.localTeam = localTeam;
    }

    public static Team getVisitantTeam() {
        return visitantTeam;
    }

    public void setVisitantTeam(Team visitantTeam) {
        this.visitantTeam = visitantTeam;
    }

    public static MatchResult getMatchResult() {
        return result;
    }

    public void setMatchResult(MatchResult result) {
        this.result = result;
    }

    public Match(Team localTeam, Team visitantTeam) {
        setLocalTeam(localTeam);
        setVisitantTeam(visitantTeam);
    }

//getWinner and getMatchStatus must be modified


    public String getMatchStatus() {
        //return this.getLocalTeam().getName() +" "+this.getLocalGoalCounter()+
        //" - "
        // +this.getVisitantGoalCounter()+" "+this.getVisitantTeam().getName();
        return "Placeholder";
    }

    public void makeVisitantGoal(int playerPosition) {
        Player playerWhoMakeGoal = getVisitantTeam().getPlayers().get(playerPosition);
        playerWhoMakeGoal.incrementGoalCounter();
        int updated_VisitantGoalCounter = (getMatchResult().getVisitantGoalCounter()) + 1;
        getMatchResult().setVisitantGoalCounter(updated_VisitantGoalCounter);
    }


    public void makeLocalGoal(int playerPosition) {
        Player playerWhoMakeGoal = getLocalTeam().getPlayers().get(playerPosition);
        playerWhoMakeGoal.incrementGoalCounter();
        int updated_LocalGoalCounter = (getMatchResult().getLocalGoalCounter()) + 1;
        getMatchResult().setLocalGoalCounter(updated_LocalGoalCounter);
    }

    public static Team getWinner(Match match) {
        if (getMatchResult().localWin()) {
            return getLocalTeam();
        } else if (getMatchResult().tie()) {
            return null;
        } else {
            return getVisitantTeam();
        }
    }

    public void Match(Season season) {

    }
}

