package it.vscalcione.springboot.crudapplicationdemo.controllers;

import it.vscalcione.springboot.crudapplicationdemo.services.CrudService;

public abstract class CrudController<DTO, PK, S extends CrudService<DTO, PK>> {
	
	protected S service;

	public CrudController(S service) {
		super();
		this.service = service;
	}
	
	
}
