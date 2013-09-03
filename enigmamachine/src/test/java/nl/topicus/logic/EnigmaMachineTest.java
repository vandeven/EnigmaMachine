package nl.topicus.logic;

import junit.framework.Assert;

import nl.topicus.entities.IRotor;
import nl.topicus.entities.Rotor;
import nl.topicus.entities.Rotor1;

import org.junit.Test;

public class EnigmaMachineTest {

	@Test
	public void testCreateMachine(){
		EnigmaMachine machine = new EnigmaMachineBuilder().build();
		Assert.assertNotNull(machine);
	}
	
	@Test
	public void testAddRotor(){
		EnigmaMachineBuilder builder = new EnigmaMachineBuilder();
		IRotor rotor = new Rotor();
		builder.addRotor(rotor);
		Assert.assertEquals(builder.rotors.size(), 1);
	}
	
	@Test
	public void testLeftToRightRotor1(){
		IRotor rotor = new Rotor1(0);
		Assert.assertEquals(20, rotor.getLeftToRight(0)); //A
		Assert.assertEquals(22, rotor.getLeftToRight(1)); //B
		Assert.assertEquals(1, rotor.getLeftToRight(10)); //k
	}
	
	@Test
	public void testRightToLeftRotor1(){
		IRotor rotor = new Rotor1(0);
		Assert.assertEquals(4, rotor.getRightToLeft(0)); //
		Assert.assertEquals(6, rotor.getRightToLeft(5)); //
		Assert.assertEquals(15, rotor.getRightToLeft(19)); //
	}
	
	@Test
	public void testLeftToRightRotor1Pos1(){
		IRotor rotor = new Rotor1(1);
		Assert.assertEquals(21, rotor.getLeftToRight(0)); //A
		Assert.assertEquals(23, rotor.getLeftToRight(1)); //B
		Assert.assertEquals(3, rotor.getLeftToRight(10)); //k
	}
	
	@Test
	public void testRightToLeftRotor1Pos1(){
		IRotor rotor = new Rotor1(1);
		Assert.assertEquals(9, rotor.getRightToLeft(0)); //K
		Assert.assertEquals(2, rotor.getRightToLeft(5)); //D
		Assert.assertEquals(25, rotor.getRightToLeft(19)); //A
	}
	
}
