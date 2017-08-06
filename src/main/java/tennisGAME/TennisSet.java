package tennisGAME;

import static tennisGAME.TennisConstants.*;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */

public class TennisSet {
    private int playerOneSetPoints ;
    private int playerTwoSetPoints ;
    
    private String playerTwoName = "Player 2 ";
	private String playerOneName = "Player 1 ";

	/**
	 * 
	 */
	public TennisSet() {
	}

	
    public void playerWinSetPoint(String name) {
    	if(name == "Player 1")
    	playerOneSetPoints +=1; 
    	else
    	playerTwoSetPoints += 1;}


    public String score() {
    	
    	String score = "";
        if(playerOneSetPoints == 0 && playerTwoSetPoints == 0) {
        	score = pointsDescription[0] + ALL;
        }
        else if(playerOneSetPoints == 6 && playerTwoSetPoints == 6) {
            score = TIEBREAK;
        }
        else if (winnerSet()) {
    			score = playerWinSet() + WINSET;
    	}
        else
        score = playerOneSetPoints + "-" + playerTwoSetPoints;
        
        return score;
    }

    private boolean winnerSet() {
		if(playerTwoSetPoints >= 6 && playerTwoSetPoints >= playerOneSetPoints + 2 )
			return true;
		if(playerOneSetPoints >= 6 && playerOneSetPoints >= playerTwoSetPoints + 2)
			return true;
		return false;
	}
    
    private String playerWinSet() {
		if (playerOneSetPoints > playerTwoSetPoints) {
			return playerOneName;
		} else {
			return playerTwoName;
		}
	}
    

}