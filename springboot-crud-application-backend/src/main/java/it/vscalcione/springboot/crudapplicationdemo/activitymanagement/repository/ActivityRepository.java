package it.vscalcione.springboot.crudapplicationdemo.activitymanagement.repository;

import it.vscalcione.springboot.crudapplicationdemo.activitymanagement.entity.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, String> {
    Iterable<Activity> findByEmployeesEmployeeId(Integer idEmployee);
}
