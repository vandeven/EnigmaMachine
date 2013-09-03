package nl.topicus.logic;

import java.util.LinkedList;
import java.util.List;

import nl.topicus.entities.IRotor;

public class EnigmaMachineBuilder {

	protected List<IRotor> rotors = new LinkedList<IRotor>();
	
	protected String inputList;
	
	protected String reflector;
	
	public EnigmaMachineBuilder(String inputList){
		this.inputList = inputList;
	}
	
	public EnigmaMachine build() {
		EnigmaMachine machine = new EnigmaMachine(rotors, inputList, reflector);
		return machine;
	}

	public EnigmaMachineBuilder addRotor(IRotor rotor) {
		rotors.add(rotor);
		return this;
	}
	
	public EnigmaMachineBuilder addReflector(String reflector){
		this.reflector = reflector;
		return this;
	}

}
