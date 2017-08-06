package tennisGAME;

import static tennisGAME.TennisConstants.*;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */

public class TennisGame {
	
	
	private Player player1_name;
	private Player player2_name;
	
	public TennisSet set = new TennisSet();
	
	public TennisGame(Player player1_name, Player player2_name) {
		checkExceptionForInvalidPlayers(player1_name, player2_name);
		this.player1_name = player1_name;
		this.player2_name = player2_name;
	}
	
	
	public String getScore() {
			String score = "";
			
		if (player1_name.getScore() == player2_name.getScore()) {
			     if(player1_name.getScore() <= 3){
			           score =  pointsDescription[player1_name.getScore()] + ALL;
			}
		else
			score = DEUCE;
		}

		if(player1_name.getScore() > 0 || this.player2_name.getScore() > 0){
			
		 if(player1_name.getScore() >= 4 || this.player2_name.getScore() >= 4) 
			{
				int scoredifference = Math.abs(player2_name.getScore() - player1_name.getScore());
				if(scoredifference ==1) score = ADVANTAGE + getLeadPlayer().getName();
				else if (scoredifference >=2) 
					{score = WIN + getLeadPlayer().getName();
					set.playerWinSetPoint(getLeadPlayer().getName());
					TennisUtils.createNewGame(player1_name, player2_name);
					}

			}
			
			else if(player1_name.getScore() < 4 && this.player2_name.getScore() < 4 && 
					!(this.player1_name.getScore() + player2_name.getScore() == 6))
			{
				score =  pointsDescription[player1_name.getScore()] + ", " + pointsDescription[player2_name.getScore()];
			}

		}
				return score;
	}
	
	private void checkExceptionForInvalidPlayers(Player player1, Player player2) {
        if ( player1 == null || player2 == null ) {
            throw new IllegalArgumentException("Invalid player: null");
        } else if ( player1.getName().equals(player2.getName()) ) {
            throw new IllegalArgumentException("Identical players not allowed: " + player1 + " - " + player2);
        }
    }
	
	public Player getLeadPlayer() {
        return (player1_name.getScore() > player2_name.getScore()) ? player1_name : player2_name;
    }
	
}
