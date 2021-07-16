package it.vscalcione.springboot.crudapplicationdemo.activitymanagement.service;

public interface CrudService<T, PK> {
    Iterable<T> findAll();
    long countAll();
    T findById(PK id);
    PK insert(T entity);
    int update(PK id, T entity);
    int deleteById(PK id);
}
