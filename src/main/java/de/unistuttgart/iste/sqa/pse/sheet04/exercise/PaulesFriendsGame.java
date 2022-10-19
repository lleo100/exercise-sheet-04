package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

/**
 * In this hamster-game {@code paule} gets two new friends.
 *
 * @author (Your name)
 * @version (A date or a version number)
 */
public class PaulesFriendsGame extends InternalPaulesFriendsGame {

	/**
	 * Creates {@code paule}s friends {@code ronnie} in the bottom right corner and
	 * {@code paula} in the bottom left corner (-> exercise 2b).
	 * Then {@code paula} walks to {@code paule} without touching {@code ronnie} (-> exercise 2c).
	 */
	void createPaulesFriends() {
		// TODO: implement according to exercise 2 of sheet 4

		// Hint: Be careful with the location of the new hamsters
	}

	/**
	 * Starts the PaulesFriendsGame to create {@code paule}s friends.
	 * Do <strong>not modify</strong> this operation!
	 */
	protected void run() {
		game.startGame();
		createPaulesFriends();
	}
}
