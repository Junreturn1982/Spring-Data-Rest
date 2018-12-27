package com.guitar.handler;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.guitar.model.Manufacturer;

@Component
@RepositoryEventHandler(Manufacturer.class)
public class ManufacturerEventHandler {
	
	@HandleBeforeCreate
	public void handleBeforeCreate(Manufacturer m) {
		// do a check to see if the name is a valid manufacturer
		// ...
		
		// auditing
		
		// only allow new manufacturer to be created in the active state.
		if(!m.getActive()) {
			throw new IllegalArgumentException("new manufacturer must be 'active'");
		}
	}

}
