package it.vscalcione.springboot.crudapplicationdemo.v1.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.vscalcione.springboot.crudapplicationdemo.v1.services.CrudService;

public abstract class CrudController<DTO, PK, S extends CrudService<DTO, PK>> {
	
	protected S service;

	public CrudController(S service) {
		super();
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showList(Model model) {
		Iterable<DTO> entityList = this.service.findAll();
		model.addAttribute(this.getEntityListModelName(), entityList);
		return this.getListView();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String showDetails(@PathVariable("id") PK id, Model model) {
		DTO entity = this.service.findById(id);
		model.addAttribute(this.getEntityModelName(), entity);
		return this.getDetailsView();
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String showNewForm() {
		return this.getFormView();
	}
	
	
	public abstract String getEntityListModelName();
	public abstract String getEntityModelName();
	public abstract String getListView();
	public abstract String getDetailsView();
	public abstract String getFormView();
	public abstract String getListUrl();
	
	
	
}
