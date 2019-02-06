/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoccerOne;

/**
 *
 * @author Peter.Sigurdson
 */
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
    }

class TeamB extends SoccerTeam{

    }

class Player{
    String PlayerName;
    int SeasonScore;
    int CareerScore;
    int RunningSpeed;
    int ScoringRank;
}