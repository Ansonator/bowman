package uk.co.blackpepper.bowman.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import uk.co.blackpepper.bowman.InlineAssociationDeserializer;

/**
 * Annotation to mark a property as an inline association.
 * 
 * @author Bryce Anson
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@JsonDeserialize(contentUsing = InlineAssociationDeserializer.class)
public @interface InlineAssociation {}
