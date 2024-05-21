package aMissionLToTheMars;

public interface SpaceShip {
	boolean launch();

	boolean landing();

	boolean canCarry(Item item);

	void carry(Item item);

}