package com.example.index_market.service;

import com.example.index_market.mapper.BaseMapper;
import com.example.index_market.mapper.Mapper;
import com.example.index_market.repository.AbstractRepository;

public abstract class AbstractService <R extends AbstractRepository>{

    protected final R repository;


    public AbstractService(R repository) {
        this.repository = repository;

    }
}
