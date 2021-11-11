package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;
/**
 * abstract class Exercise04Base - describe this class right here.
 * 
 * @author (Your name)
 * @version (A date or a version number)
 */
public abstract class InternalPaulesFriendsGame extends InspectableSimpleHamsterGame{
	public InternalPaulesFriendsGame() {
		this.loadTerritoryFromResourceFile("/territories/territory-ub04.ter");
		this.displayInNewGameWindow();
	}
}
