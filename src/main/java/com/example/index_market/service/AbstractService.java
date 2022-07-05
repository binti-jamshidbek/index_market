package com.example.index_market.service;

import com.example.index_market.mapper.Mapper;
import com.example.index_market.repository.AbstractRepository;

public abstract class AbstractService <R extends AbstractRepository, M extends Mapper>{
    protected final R repository;
    protected final M mapper;

    public AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
