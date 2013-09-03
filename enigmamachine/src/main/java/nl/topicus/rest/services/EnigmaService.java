package nl.topicus.rest.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.ext.Provider;

@Provider
@Path("/enigma")
public class EnigmaService {
	@GET
	@Path("/")
	public String getMessage()
	{
		return "blah";
	}
}
