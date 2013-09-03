package nl.topicus.entities;

public class Rotor implements IRotor{

	public static final String leftSide = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private int position;	
	
	private final String rightSide;
	
	public Rotor(String rightSide, int position)
	{
		this.position = position;
		this.rightSide = rightSide;
	}
	
	@Override
	public int getLeftToRight(int index) {
		return correctIndex(rightSide.indexOf(leftSide.charAt(correctIndex(index + position))) - position);
	}

	@Override
	public int getRightToLeft(int index) {
		return correctIndex(leftSide.indexOf(rightSide.charAt(correctIndex(index + position))) - position);
	}

	@Override
	public void rotate() {
		if(position == rightSide.length()-1){
			position = 0;
		} else {
			position++;
		}
	}
	
	private int correctIndex(int index)
	{
		if(index >= leftSide.length()){
			return index - leftSide.length();
		}
		else if(index < 0){
			return leftSide.length() + index;
		}
		return index;
	}

}
