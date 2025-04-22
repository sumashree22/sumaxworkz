package com.xworkz.toString.Cricket;

public class CricketRunner {
    public static void main(String[] args) {
        Cricket player = new Cricket();

        player.setTeamName("India");
        player.setPlayerName("Virat Kohli");
        player.setTotalRuns(12000);
        player.setWicketsTaken(0);  // Not a bowler
        player.setBattingAverage(52.04);
        player.setBowlingAverage(0.00);
        player.setRole("Batsman");

        System.out.println(player.toString());
    }
}

