package nl.topicus.entities;

public class Rotor1 implements IRotor {

	private final IRotor rotor;
	
	private final String rightSide = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";	
	
	public Rotor1(int position){
		this.rotor = new Rotor(rightSide, position);
	}
	
	@Override
	public int getLeftToRight(int index) {
		return rotor.getLeftToRight(index);
	}

	@Override
	public int getRightToLeft(int index) {
		return rotor.getRightToLeft(index);
	}

	@Override
	public void rotate() {
		rotor.rotate();
		
	}	

}
