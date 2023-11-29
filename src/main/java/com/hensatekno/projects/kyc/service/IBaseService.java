package com.hensatekno.projects.kyc.service;

import org.springframework.data.domain.Page;

import java.io.Serializable;

public interface IBaseService<T, ID extends Serializable> {
    T getById(ID id);
    Page<T> getAll(int page, int size);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}
