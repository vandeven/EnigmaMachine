package nl.topicus.entities;

public class Rotor1 implements IRotor {
	
	private String rightSide ="EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	
	private int position;
	
	public Rotor1(int position)
	{
		this.position = position;
	}
	@Override
	public int getLeftToRight(int index) {
		return rightSide.indexOf(leftSide.charAt(index));
	}

	@Override
	public int getRightToLeft(int index) {
		return leftSide.indexOf(rightSide.charAt(index));
	}

	@Override
	public void rotate() {
		if(position == rightSide.length()){
			position = 0;
		} else {
		position++;
		}
	}

}
