package com.example.users.domain.comun;

import java.util.List;

public interface CrudBase<T, ID> {
    T findById(ID id);
    List<T> findAll();
    T save(T entity);
    void update(T entity);
    void delete(T entity);

}
