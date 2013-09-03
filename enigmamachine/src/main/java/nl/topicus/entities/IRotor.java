package nl.topicus.entities;

public interface IRotor {
	public static final String leftSide = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	int getLeftToRight(int index);
	int getRightToLeft(int index);
	void rotate();	
}
