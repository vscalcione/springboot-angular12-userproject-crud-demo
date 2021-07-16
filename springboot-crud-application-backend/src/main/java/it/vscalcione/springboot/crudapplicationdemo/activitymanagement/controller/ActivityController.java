package it.vscalcione.springboot.crudapplicationdemo.activitymanagement.controller;

import it.vscalcione.springboot.crudapplicationdemo.activitymanagement.service.ActivityService;
import it.vscalcione.springboot.crudapplicationdemo.activitymanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/activity")
public class ActivityController extends CrudController<ActivityDTO, String, ActivityService> {

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
        model.addAttribute("employeesList", this.employeeService.employeesActivityList(idActivity));
        return "activity/employeesActivityList";
    }

    @Override
    protected String getEntityListModelName() {
        return null;
    }

    @Override
    protected String getEntityModelName() {
        return null;
    }

    @Override
    protected String getListView() {
        return null;
    }

    @Override
    protected String getDetailsView() {
        return null;
    }

    @Override
    protected String getFormView() {
        return null;
    }

    @Override
    protected String getListUrl() {
        return null;
    }


}
