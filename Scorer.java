// Scorer.java
public class Scorer extends Team{
    String player;
    int goalsScored;
    Scorer(String player, int goalsScored, String team, int won, int drawn, int lost, int goalsFor, int goalsAgainst){
        super(team, won, drawn, lost, goalsFor, goalsAgainst);
        this.player = player;
        this.goalsScored = goalsScored;
    }
    float contribution(){
        return (float)this.goalsScored / (float)this.goalsFor;
    }
    float goalsPerMatch(){
        return (float)this.goalsScored/(float)(this.won + this.drawn + this.lost);
    }
}