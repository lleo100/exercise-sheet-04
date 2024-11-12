package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Territory;
import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * In this hamster-game {@code paule} gets two new friends.
 *
 * @author (Your name)
 * @version (A date or a version number)
 */
public class PaulesFriendsGame extends InternalPaulesFriendsGame {

	/**
	 * Creates {@code paule}s friends {@code ronnie} in the bottom right corner and
	 * {@code paula} in the bottom left corner.
	 */
	void createPaulesFriends() {
	
		// TODO initialize variables below with values according to exercise 1 of sheet 4
		
		// Local variables for Ronnie
		Location locationRonnie;
		Direction directionRonnie;
		Territory territoryRonnie;
		Integer grainCountRonnie;
		
		// Local variables for Paula
		Location locationPaula;
		Direction directionPaula;
		Territory territoryPaula;
		Integer grainCountPaula;
		
		// TODO create hamsters according to exercise 1 of sheet 4

				

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
