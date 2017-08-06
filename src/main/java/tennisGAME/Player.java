package tennisGAME;

/**
 * Author: Marouane ERRADI
 * marouane.erradi@gmail.com
 * Aug 03, 2017
 */

public class Player {

	private int score;
	String name;
	
    /**
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void winPoint() {
        this.score = this.score + 1;
    }

}