package com.xworkz.toString.Cricket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cricket {
    private String teamName;
    private String playerName;
    private int totalRuns;
    private int wicketsTaken;
    private double battingAverage;
    private double bowlingAverage;
    private String role; // e.g., Batsman, Bowler, All-rounder

    @Override
    public String toString() {
        return "Cricket Player Details:\n" +
                "Team Name = " + this.teamName + "\n" +
                "Player Name = " + this.playerName + "\n" +
                "Total Runs = " + this.totalRuns + "\n" +
                "Wickets Taken = " + this.wicketsTaken + "\n" +
                "Batting Average = " + this.battingAverage + "\n" +
                "Bowling Average = " + this.bowlingAverage + "\n" +
                "Role = " + this.role;
    }
}
