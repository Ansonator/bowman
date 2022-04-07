package uk.co.blackpepper.bowman.test.it.model;

import java.util.List;

import org.datrunk.naked.entities.bowman.annotation.LinkedResource;
import org.datrunk.naked.entities.bowman.annotation.RemoteResource;

@RemoteResource("/simple-entities/search")
public interface SimpleEntitySearch {
	
	@LinkedResource
	SimpleEntity findByName(String name);
	
	@LinkedResource
	List<SimpleEntity> findByNameContaining(String query);
}
