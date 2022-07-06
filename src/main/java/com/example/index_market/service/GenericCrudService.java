package com.example.index_market.service;

import com.example.index_market.dto.Dto;
import com.example.index_market.dto.GenericDto;
import com.example.index_market.entity.BaseEntity;
import com.example.index_market.response.ApiResponse;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;


public interface GenericCrudService <
        E extends BaseEntity,
        D extends Dto,
        CD extends Dto,
        UD extends GenericDto,
        K extends Serializable> extends GenericService<D,K>{

    ApiResponse create(CD createDto);

    ApiResponse update(UD updateDto);

    ApiResponse delete(K id);
}
