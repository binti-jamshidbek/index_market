package com.example.index_market.service.product;

import com.example.index_market.dto.product.ProductCreateDto;
import com.example.index_market.dto.product.ProductDto;
import com.example.index_market.dto.product.ProductUpdateDto;
import com.example.index_market.entity.product.Product;
import com.example.index_market.service.BaseService;
import com.example.index_market.service.GenericCrudService;

public interface ProductService  extends GenericCrudService<
        Product,
        ProductDto,
        ProductCreateDto,
        ProductUpdateDto,
        String>,
        BaseService {
}
