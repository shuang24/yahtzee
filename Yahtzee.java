/*
 * File: Yahtzee.java
 * ------------------
 * This program will eventually play the Yahtzee game.
 */

import acm.io.*;
import acm.program.*;
import acm.util.*;

public class Yahtzee extends GraphicsProgram implements YahtzeeConstants {
	
	public static void main(String[] args) {
		new Yahtzee().start(args);
	}
	
	public void run() {
		IODialog dialog = getDialog();
		nPlayers = dialog.readInt("Enter number of players");
		playerNames = new String[nPlayers];
		for (int i = 1; i <= nPlayers; i++) {
			playerNames[i - 1] = dialog.readLine("Enter name for player " + i);
		}
		display = new YahtzeeDisplay(getGCanvas(), playerNames);
		playGame();
	}

	private void playGame() {
		/* You fill this in */
	}
	
	private void firstRoll(int player) {
	    String playerName = playerNames[player];                
	    display.printMessage(playerName + "'s turn. Click \"Roll Dice\" button to roll the dice.");
	    display.waitForPlayerToClickRoll(player);
	    rollDice(true);
	    display.displayDice(dice);      
	}
		
/* Private instance variables */
	private int nPlayers;
	private String[] playerNames;
	private YahtzeeDisplay display;
	private RandomGenerator rgen = new RandomGenerator();
	private int[] dice = new int[N_DICE];
	private boolean[][] usedCategories;
	private int[] upperScore;
	private int[] lowerScore;
	private int[] totalScore;
	
	/* constant value */
	private static final int N_ROLLS = 3;
	private static final int N_FACES = 6;
	private static final int SCORE_FULL_HOUSE = 25;
	private static final int SCORE_SMALL_STRAIGHT = 30;
	private static final int SCORE_LARGE_STRAIGHT = 40;
	private static final int SCORE_YAHTZEE = 50;
	private static final int SCORE_UPPER_BONUS_LIMIT = 63;
	private static final int SCORE_UPPER_BONUS = 35;

}
