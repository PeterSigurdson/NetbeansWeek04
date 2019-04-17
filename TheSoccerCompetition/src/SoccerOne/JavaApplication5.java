/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoccerOne;
import java.util.Random;

public class JavaApplication5 {

    public static void main(String[] args) {
        
    }
}

class SoccerTeam{
    String TeamName;
    int NumberOfWins;
    int ShotsOnTarget;
}

class TeamA extends SoccerTeam{
        Player Joe = new Player();
        Player Moe = new Player();
        Player Loe = new Player();
    }

class TeamB extends SoccerTeam{
        Player Brad = new Player();
        Player Jad = new Player();
        Player Lad = new Player();
    }

        class Player{
            Random rand = new Random();
            public Player(){
                this.RunningSpeed = rand.nextInt(100);
                this.ScoringRank = rand.nextInt(100);
    }
    
    String PlayerName;
    int SeasonScore;
    int CareerScore;
    int RunningSpeed;
    int ScoringRank;
}

class Competition{
    public void doCompetition(){
        
    }
}