package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;

/**
 * Creates and runs Hamster-Simulator for exercise 2 in part A.
 */
public abstract class InternalPaulesFriendsGame extends InspectableSimpleHamsterGame {
	public InternalPaulesFriendsGame() {
		this.loadTerritoryFromResourceFile("/territories/territory-ub04.ter");
		this.displayInNewGameWindow();
	}
}
