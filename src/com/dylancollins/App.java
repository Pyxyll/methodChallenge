package com.dylancollins;

public class App {
    public static void main(String[] args) throws Exception {
        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Vex", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Vax", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Grog", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Pyke", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Scanlan", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("keyleth", HighScorePosition);
    }
    public static void displayHighScorePosition (String playerName, int HighScorePosition) {
        System.out.println(playerName + " managed to get into postion "
        + HighScorePosition + " On the score table.");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
