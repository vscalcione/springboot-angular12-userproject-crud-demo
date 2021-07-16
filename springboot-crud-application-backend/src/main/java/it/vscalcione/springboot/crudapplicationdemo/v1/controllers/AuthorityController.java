package it.vscalcione.springboot.crudapplicationdemo.v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.vscalcione.springboot.crudapplicationdemo.v1.services.AuthorityService;

@Controller
@RequestMapping("/authorities")
public class AuthorityController extends CrudController<AuthorityDto, String, AuthorityService> {
	
	@Autowired
	public AuthorityController(AuthorityService service) {
		super(service);
	}
	

}
