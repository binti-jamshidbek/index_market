package com.example.index_market.service;

import org.springframework.http.ResponseEntity;
import uz.sh.online_queue.criteria.GenericCriteria;
import uz.sh.online_queue.dto.Dto;
import uz.sh.online_queue.entity.BaseEntity;
import uz.sh.online_queue.response.Data;

import java.io.Serializable;


public interface GenericCrudService <
        E extends BaseEntity,
        D extends Dto,
        CD extends Dto,
        UD extends Dto,
        C extends GenericCriteria,
        K extends Serializable> extends GenericService<D,K,C>{

    ResponseEntity<Data<K>> create(CD createDto);

    ResponseEntity<Data<D>> update(UD updateDto);

    ResponseEntity<Data<Void>> delete(K id);
}
