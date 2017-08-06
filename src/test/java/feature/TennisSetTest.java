package feature;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tennisGAME.TennisSet;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */

public class TennisSetTest {
	
    TennisSet set;
	@Before
    public void beforeGameTest() {
	 set = new TennisSet();
	 
	}
	
	private void addPlayerSetPoints(int playerOneSet, int playerTwoSet ) {
		for (int i = 0; i < playerOneSet; i++) {
			set.playerWinSetPoint("Player 1");
		}
		for (int i = 0; i < playerTwoSet; i++) {
			set.playerWinSetPoint("Player 2");
		}
	}
	
    

    @Test
    public void testSetStartsWithScore0Game () {
        Assert.assertEquals("Love-All", set.score());
    }

    @Test
    public void testPlayerOneWinsSet() {
    	addPlayerSetPoints(6, 4);
        Assert.assertEquals("Player 1  Win Set", set.score());
    }

    @Test
    public void testPlayerTwoWinsSet() {
    	addPlayerSetPoints(4, 6);
        Assert.assertEquals("Player 2  Win Set", set.score());
    }

    @Test
    public void testPlayerOneHasNotWonSet() {
    	addPlayerSetPoints(6, 5);
    	set.playerWinSetPoint("Player 1");
    	Assert.assertEquals("Player 1  Win Set", set.score());
    }


    @Test
    public void testTieBreaker() {
    	addPlayerSetPoints(6, 6);
        Assert.assertEquals("Tie Breaker", set.score());
    }

}