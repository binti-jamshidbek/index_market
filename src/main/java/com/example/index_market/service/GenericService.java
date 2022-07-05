package com.example.index_market.service;

import org.springframework.http.ResponseEntity;
import uz.sh.online_queue.criteria.GenericCriteria;
import uz.sh.online_queue.dto.Dto;
import uz.sh.online_queue.response.Data;

import java.io.Serializable;
import java.util.List;

public interface GenericService <
        D extends Dto,
        K extends Serializable,
        C extends GenericCriteria> {

    ResponseEntity<Data<List <D>>> getAll(C criteria);
    ResponseEntity<Data<D>> get (K id);
}
