package tennisGAME;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */

public class TieBreak {
	
	private Player player1;
	private Player player2;

	
	private int tieBreakplayerOne ;
    private int tieBreakplayerTwo ;
    private Player winner;
	
	
	
	public TieBreak(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public Player playerWinGameWinner() {
		Player tieBreakWinner = null;
		if((tieBreakplayerOne>=TennisConstants.MINIMUM_TO_WIN_TIE_BREAK) && (tieBreakplayerOne-tieBreakplayerTwo>=TennisConstants.TENNIS_DIFFERENCE)){
			tieBreakWinner = player1;
		} else if((tieBreakplayerTwo>=TennisConstants.MINIMUM_TO_WIN_TIE_BREAK) && (tieBreakplayerTwo-tieBreakplayerOne>=TennisConstants.TENNIS_DIFFERENCE)){
			tieBreakWinner = player2;
		}
		return tieBreakWinner;
	}

	public void playerWinTieBreakPoint(String name) {
    	if(name == "Player 1")
    		tieBreakplayerOne +=1; 
    	else
    		tieBreakplayerTwo += 1;}

	/**
	 * @return the player1
	 */
	public Player getPlayer1() {
		return player1;
	}


	/**
	 * @param player1 the player1 to set
	 */
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}


	/**
	 * @return the player2
	 */
	public Player getPlayer2() {
		return player2;
	}


	/**
	 * @param player2 the player2 to set
	 */
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	/**
	 * @return the tieBreakplayerOne
	 */
	public int getTieBreakplayerOne() {
		return tieBreakplayerOne;
	}

	/**
	 * @param tieBreakplayerOne the tieBreakplayerOne to set
	 */
	public void setTieBreakplayerOne(int tieBreakplayerOne) {
		this.tieBreakplayerOne = tieBreakplayerOne;
	}

	/**
	 * @return the tieBreakplayerTwo
	 */
	public int getTieBreakplayerTwo() {
		return tieBreakplayerTwo;
	}

	/**
	 * @param tieBreakplayerTwo the tieBreakplayerTwo to set
	 */
	public void setTieBreakplayerTwo(int tieBreakplayerTwo) {
		this.tieBreakplayerTwo = tieBreakplayerTwo;
	}
	
	@Override
	public String toString() {
		StringBuilder toReturn = new StringBuilder();
		toReturn.append(tieBreakplayerOne);
		toReturn.append("-");
		toReturn.append(tieBreakplayerTwo);
		return toReturn.toString();
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	
}
