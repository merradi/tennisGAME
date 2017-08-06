package feature;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import tennisGAME.Player;
import tennisGAME.TennisGame;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */

public class TennisGameTest {

    Player player1;
    Player player2;
    TennisGame game;

    @Before
    public void beforeGameTest() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        game = new TennisGame(player1, player2);
        
    }

    @Test
    public void testNewGameShouldReturnLoveAll() {
		assertEquals("Love-All", game.getScore());
    }

    @Test
    public void testPlayerOneWinsFirstBall() {
        player2.winPoint();
		assertEquals("Love, Fifteen", game.getScore());
    }

    @Test
    public void testPlayerTwoWinsTwoBallsandPlayerOneWinsOneBall() {
    	createScore(2, 1);
    	assertEquals("Thirty, Fifteen", game.getScore());
    }

    @Test
    public void testPlayerOneWinsFirstThreeBalls() {
    	createScore(3, 0);
    	assertEquals("Forty, Love", game.getScore());
    }


    @Test
    public void testPlayerTwoAdvantage() {
    	createScore(3, 4);
    	assertEquals("Advantage Player 2", game.getScore());
    }
    
    @Test
    public void testPlayersAreFortyAll() {
		createScore(3, 3);
		
		String score = game.getScore();
		assertEquals("Forty-All", score);		
	}

    @Test
    public void testPlayerOneWinsAfterAdvantageandDeuce() {
    	createScore(4, 4);
    	assertEquals("Deuce", game.getScore());
        player1.winPoint();
        assertEquals("Advantage Player 1", game.getScore());
        player1.winPoint();
        assertEquals("Win for Player 1", game.getScore());
    }

    private void createScore(int playerOneBalls, int playerTwoBalls ) {
		for (int i = 0; i < playerOneBalls; i++) {
			player1.winPoint();
		}
		for (int i = 0; i < playerTwoBalls; i++) {
			player2.winPoint();
		}
	}
    


}
