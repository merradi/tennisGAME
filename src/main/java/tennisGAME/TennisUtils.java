package tennisGAME;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */

public class TennisUtils {
	
	public static TennisGame createNewGame(Player player1, Player player2) {
		TennisGame newGame = new TennisGame(player1,player2);
		initializeNextGame(player1,player2);
		
		return newGame;
	}


	public static void initializeNextGame(Player player1, Player player2) {
	player1.setScore(0);
	player2.setScore(0);
}
	
	
}
