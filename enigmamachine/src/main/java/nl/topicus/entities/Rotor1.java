package nl.topicus.entities;

public class Rotor1 extends Rotor {

	public Rotor1(char position) {
		super(position);
	}

	@Override
	protected String getRightSide() {
		return "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	}
}
