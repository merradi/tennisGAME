package feature;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tennisGAME.Player;
import tennisGAME.TieBreak;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */
public class TieBreakTest {
	
	private Player player1 ;
	private Player player2 ;
	private TieBreak tieBreak;
	
	@Before
	public void setUp() {
		player1 = new Player("Player 1");
		player2 = new Player("Player 2");
		tieBreak = new TieBreak(player1, player2);
	  }

	@Test
	public void testBreakPointsPlayers() {
			
	    assertEquals(tieBreak.toString(), "0-0" );
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    assertNull(tieBreak.getWinner());
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    tieBreak.playerWinTieBreakPoint("Player 2");
	    tieBreak.playerWinTieBreakPoint("Player 2");
	    assertEquals(tieBreak.toString(), "2-2" );
	    assertNull(tieBreak.getWinner());
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    tieBreak.playerWinTieBreakPoint("Player 2");
	    tieBreak.playerWinTieBreakPoint("Player 2");
	    tieBreak.playerWinTieBreakPoint("Player 2");
	    tieBreak.playerWinTieBreakPoint("Player 2");
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    tieBreak.playerWinTieBreakPoint("Player 1");
	    assertEquals(tieBreak.playerWinGameWinner().getName(),  "Player 1");
	  }
	
}
