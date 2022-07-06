package com.example.index_market.service.product;

import com.example.index_market.dto.product.ProductCreateDto;
import com.example.index_market.dto.product.ProductDto;
import com.example.index_market.dto.product.ProductUpdateDto;
import com.example.index_market.entity.product.Product;
import com.example.index_market.mapper.product.ProductMapImpl;
import com.example.index_market.repository.product.ProductRepository;
import com.example.index_market.response.ApiResponse;
import com.example.index_market.service.AbstractService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl extends AbstractService<ProductRepository> implements ProductService {

    public ProductServiceImpl(ProductRepository repository) {
        super(repository);
    }

    @Override
    public ApiResponse create(ProductCreateDto createDto) {

        return null;
    }

    @Override
    public ApiResponse update(ProductUpdateDto updateDto) {
        return null;
    }

    @Override
    public ApiResponse delete(String id) {
        return null;
    }

    @Override
    public ApiResponse getAll() {
        return null;
    }

    @Override
    public ApiResponse get(String id) {
         return null;
    }
}
