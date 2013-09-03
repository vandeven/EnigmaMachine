package nl.topicus.logic;

import java.util.LinkedList;
import java.util.List;

import nl.topicus.entities.IRotor;

public class EnigmaMachineBuilder {

	protected List<IRotor> rotors = new LinkedList<IRotor>();
	
	public EnigmaMachine build() {
		EnigmaMachine machine = new EnigmaMachine();
		return machine;
	}

	public void addRotor(IRotor rotor) {
		rotors.add(rotor);
	}

}
