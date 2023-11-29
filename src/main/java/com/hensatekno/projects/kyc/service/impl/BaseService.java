package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.service.IBaseService;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public abstract class BaseService<T, ID extends Serializable, R extends JpaRepository<T, ID>> implements IBaseService<T, ID> {
    protected final R repository;

    public BaseService(R repository) {
        this.repository = repository;
    }

    @Override
    public T getById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Page<T> getAll(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public T update(ID id, T updatedEntity) {
        if (repository.existsById(id)) {
            T existingEntity = repository.findById(id).orElse(null);

            if (existingEntity != null) {
                // Create a ModelMapper instance
                ModelMapper modelMapper = new ModelMapper();

                // Configure ModelMapper to skip null values
                modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());

                // Use ModelMapper to map updatedEntity to existingEntity
                modelMapper.map(updatedEntity, existingEntity);

                // Save the updated entity
                return repository.save(existingEntity);
            }
        }

        // Handle entity not found or other cases
        return null;
    }

    @Override
    public void delete(ID id) {
        repository.deleteById(id);
    }
}
