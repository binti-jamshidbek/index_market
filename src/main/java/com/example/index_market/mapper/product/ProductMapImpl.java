package com.example.index_market.mapper.product;

import com.example.index_market.dto.product.ProductCreateDto;
import com.example.index_market.dto.product.ProductDto;
import com.example.index_market.dto.product.ProductUpdateDto;
import com.example.index_market.entity.product.Product;
import com.example.index_market.mapper.BaseMapper;

import java.util.List;

public class ProductMapImpl implements   BaseMapper<Product,
        ProductDto,
        ProductCreateDto,
        ProductUpdateDto> {
    @Override
    public ProductDto toDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());

        return productDto;
    }

    @Override
    public List<ProductDto> toDto(List<Product> e) {

        return null;
    }

    @Override
    public Product fromCreateDto(ProductCreateDto productCreateDto) {
        return null;
    }

    @Override
    public Product fromUpdateDto(ProductUpdateDto d) {
        return null;
    }
}
