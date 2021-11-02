package de.unistuttgart.iste.sqa.pse.sheet04.exercise;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;
/**
 * abstract class Exercise04Base - describe this class right here.
 * 
 * @author (Your name)
 * @version (A date or a version number)
 */
public abstract class Exercise04Base extends InspectableSimpleHamsterGame{
	public Exercise04Base() {
		this.loadTerritoryFromResourceFile("/territories/territory-ub04.ter");
		this.displayInNewGameWindow();
	}
}
