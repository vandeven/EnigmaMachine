package nl.topicus.entities;

public abstract class Rotor implements IRotor{

	public static final String leftSide = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private int position;	
	
	public Rotor(char startPosition)
	{
		this.position = leftSide.indexOf(String.valueOf(startPosition).toUpperCase());
	}
	
	@Override
	public final int getLeftToRight(int index) {
		return correctIndex(getRightSide().toUpperCase().indexOf(leftSide.charAt(correctIndex(index + position))) - position);
	}

	@Override
	public final int getRightToLeft(int index) {
		return correctIndex(leftSide.indexOf(getRightSide().toUpperCase().charAt(correctIndex(index + position))) - position);
	}

	@Override
	public final void rotate() {
		if(position == leftSide.length()-1){
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
	
	/**
	 * non null
	 * @return
	 */
	protected abstract String getRightSide();

}
