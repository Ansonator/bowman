package uk.co.blackpepper.bowman.test.it.model;

import java.net.URI;

import org.datrunk.naked.entities.bowman.annotation.LinkedResource;
import org.datrunk.naked.entities.bowman.annotation.RemoteResource;
import org.datrunk.naked.entities.bowman.annotation.ResourceId;

@RemoteResource("/pageable-entities")
public class PageableEntity {

	private URI id;
	
	private String name;
	
	private PageableEntity linked;
	
	@ResourceId
	public URI getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@LinkedResource
	public PageableEntity getLinked() {
		return linked;
	}
	
	public void setLinked(PageableEntity linked) {
		this.linked = linked;
	}
}
