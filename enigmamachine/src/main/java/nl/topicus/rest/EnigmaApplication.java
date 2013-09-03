package nl.topicus.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import nl.topicus.rest.services.EnigmaService;

public class EnigmaApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public EnigmaApplication()
	{
		singletons.add(new EnigmaService());
	}

	@Override
	public Set<Object> getSingletons()
	{
		return singletons;
	}
}
