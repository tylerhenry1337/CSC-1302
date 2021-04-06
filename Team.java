// Team.java
public class Team {
    String team;
    int won;
    int drawn;
    int lost;
    int goalsFor;
    int goalsAgainst;
    Team(String team, int won, int drawn, int lost, int goalsFor, int goalsAgainst){
        this.team = team;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }
    int matchesPlayed(){
        return won + drawn + lost;
    }
    int goalDifference(){
        return goalsFor - goalsAgainst;
    }
    int points(){
        return (won * 3) + (drawn * 1);
    }
}
