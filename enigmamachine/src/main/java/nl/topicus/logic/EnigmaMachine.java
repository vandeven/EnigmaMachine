package nl.topicus.logic;

import java.util.LinkedList;
import java.util.List;

import nl.topicus.entities.IRotor;

public class EnigmaMachine {
	
	private final List<IRotor> rotors;
	private final String inputList;
	private final String reflector;

	public EnigmaMachine(List<IRotor> rotors, String inputList, String reflector){
		this.rotors = rotors;
		this.inputList = inputList;
		this.reflector = reflector;		
	}
	
	public String encrypt(String message){
		StringBuilder encrypted = new StringBuilder(message.length());
		for(char c : message.toCharArray()){
			inputList.indexOf(c);
		}
		return encrypted.toString();
	}
}
