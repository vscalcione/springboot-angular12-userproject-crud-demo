package it.vscalcione.springboot.crudapplicationdemo.v1.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/activity")
public class ActivityController extends CrudController<ActivityDto, String, ActivityService> {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	public ActivityController(ActivityService service) {
		super(service);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/{id}/showEmployees", method = RequestMethod.GET)
	public String showEditForm(@PathVariable("id") String idActivity, Model model) {
		model.addAttribute("idActivity", idActivity);
		model.addAttribute("employeesList", this.employeeService.employeeActivitiesEmployee(idActivity));
		return "activity/employeeActivitiesEmployee";
	}
	
}
