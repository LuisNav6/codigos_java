/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class info {
   String [] TeamName = new String[33];
    int point;
    int wins;
    int ties; // rondas
    int losses;
    int scored;
    int against; // concedido
    
    public String[] getTeamName() {
        return TeamName;
    }
    public void setTeamName(String[] teamName) {
        TeamName = teamName;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public int getTies() {
        return ties;
    }
    public void setTies(int ties) {
        this.ties = ties;
    }
    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }
    public int getScored() {
        return scored;
    }
    public void setScored(int scored) {
        this.scored = scored;
    }
    public int getAgainst() {
        return against;
    }
    public void setAgainst(int against) {
        this.against = against;
    }
    public void setTeamName(String x) {
    }

}
