package com.example.index_market.service;

import com.example.index_market.dto.Dto;
import com.example.index_market.response.Data;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface GenericService <
        D extends Dto,
        K extends Serializable> {

    ResponseEntity<Data<List <D>>> getAll();
    ResponseEntity<Data<D>> get (K id);
}
