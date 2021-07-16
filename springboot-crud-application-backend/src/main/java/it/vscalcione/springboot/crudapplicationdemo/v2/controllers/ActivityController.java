package it.vscalcione.springboot.crudapplicationdemo.v2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
public class ActivityController {
	
	@Autowired
	private final ActivityService activityService;

	public ActivityController(ActivityService activityService) {
		this.activityService = activityService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Activity>> getAllActivities() {
		List<Activity> activities = activityService.findAllActivities();
		return new ResponseEntity<>(activities, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Activity> getActivityById(@PathVariable("id") Long id) {
		Activity activity = activityService.findActivityById(id);
		return new ResponseEntity<>(activity, HttpStatus.OK);
	}
	
	
}
