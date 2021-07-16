package it.vscalcione.springboot.crudapplicationdemo.activitymanagement.repository;

import it.vscalcione.springboot.crudapplicationdemo.activitymanagement.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Iterable<Employee> findByActivitiesIdActivity(String idActivity);
}
