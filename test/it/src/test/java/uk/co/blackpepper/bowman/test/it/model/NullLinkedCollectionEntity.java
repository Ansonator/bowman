package uk.co.blackpepper.bowman.test.it.model;

import java.net.URI;
import java.util.Set;

import org.datrunk.naked.entities.bowman.annotation.LinkedResource;
import org.datrunk.naked.entities.bowman.annotation.RemoteResource;
import org.datrunk.naked.entities.bowman.annotation.ResourceId;

@RemoteResource("/null-linked-collections")
public class NullLinkedCollectionEntity {

	private URI id;

	private Set<SimpleEntity> linked;

	@ResourceId
	public URI getId() {
		return id;
	}

	@LinkedResource
	public Set<SimpleEntity> getLinked() {
		return linked;
	}

	public void setLinked(Set<SimpleEntity> linked) {
		this.linked = linked;
	}
}
