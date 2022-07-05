package com.example.index_market.mapper.product;

import com.example.index_market.dto.product.ProductCreateDto;
import com.example.index_market.dto.product.ProductDto;
import com.example.index_market.dto.product.ProductUpdateDto;
import com.example.index_market.entity.product.Product;
import com.example.index_market.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<
        Product,
        ProductDto,
        ProductCreateDto,
        ProductUpdateDto> {
}
