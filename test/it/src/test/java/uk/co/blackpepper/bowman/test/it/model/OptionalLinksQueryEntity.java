package uk.co.blackpepper.bowman.test.it.model;

import java.net.URI;
import java.util.List;

import org.datrunk.naked.entities.bowman.annotation.LinkedResource;
import org.datrunk.naked.entities.bowman.annotation.RemoteResource;
import org.datrunk.naked.entities.bowman.annotation.ResourceId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@RemoteResource("/optional-links-entities-query")
public class OptionalLinksQueryEntity {

	private URI id;

	private String name;
	
	private SimpleEntity optionalLinkItem;
	
	private List<SimpleEntity> optionalLinkCollection;
	
	@ResourceId
	@JsonIgnore
	public URI getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@LinkedResource(optionalLink = true)
	public SimpleEntity getOptionalLinkItem() {
		return optionalLinkItem;
	}
	
	public void setOptionalLinkItem(SimpleEntity optionalLinkItem) {
		this.optionalLinkItem = optionalLinkItem;
	}
	
	@LinkedResource(optionalLink = true)
	public List<SimpleEntity> getOptionalLinkCollection() {
		return optionalLinkCollection;
	}
	
	public void setOptionalLinkCollection(List<SimpleEntity> optionalLinkCollection) {
		this.optionalLinkCollection = optionalLinkCollection;
	}
}
