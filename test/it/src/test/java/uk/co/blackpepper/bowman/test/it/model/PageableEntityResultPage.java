package uk.co.blackpepper.bowman.test.it.model;

import java.util.List;

import org.datrunk.naked.entities.bowman.annotation.LinkedResource;
import org.datrunk.naked.entities.bowman.annotation.RemoteResource;
import org.springframework.hateoas.mediatype.hal.Jackson2HalModule;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import uk.co.blackpepper.bowman.InlineAssociationDeserializer;

@RemoteResource("/pageable-entities")
public abstract class PageableEntityResultPage {
	
	private List<PageableEntity> content;
	
	@JsonProperty("_embedded")
	@JsonDeserialize(
		using = Jackson2HalModule.HalResourcesDeserializer.class,
		contentUsing = InlineAssociationDeserializer.class,
		contentAs = PageableEntity.class)
	public List<PageableEntity> getContent() {
		return content;
	}
	
	public void setContent(List<PageableEntity> content) {
		this.content = content;
	}
	
	@LinkedResource
	public abstract PageableEntityResultPage getNext();
}
