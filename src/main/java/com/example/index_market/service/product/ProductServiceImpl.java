package com.example.index_market.service.product;

import com.example.index_market.dto.product.ProductCreateDto;
import com.example.index_market.dto.product.ProductDto;
import com.example.index_market.dto.product.ProductUpdateDto;
import com.example.index_market.mapper.product.ProductMapper;
import com.example.index_market.repository.product.ProductRepository;
import com.example.index_market.response.Data;
import com.example.index_market.service.AbstractService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends AbstractService<ProductRepository, ProductMapper> implements ProductService {

    public ProductServiceImpl(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<String>> create(ProductCreateDto createDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<ProductDto>> update(ProductUpdateDto updateDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<ProductDto>>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<Data<ProductDto>> get(String id) {
        return null;
    }
}
