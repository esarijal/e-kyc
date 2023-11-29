package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public abstract class BaseRestController<T, ID extends Serializable, S extends IBaseService<T, ID>> {
    @Autowired
    protected S service;

    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable ID id) {
        T entity = service.getById(id);
        return ResponseEntity.ok(entity);
    }

    @GetMapping
    public ResponseEntity<Page<T>> getAll(@RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "10") int size) {
        Page<T> entities = service.getAll(page, size);
        return ResponseEntity.ok(entities);
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        T createdEntity = service.create(entity);
        return ResponseEntity.ok(createdEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity) {
        T updatedEntity = service.update(id, entity);
        return ResponseEntity.ok(updatedEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
