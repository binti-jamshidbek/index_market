package com.example.index_market.dto.product;

import com.example.index_market.dto.Dto;
import com.example.index_market.dto.GenericDto;
import com.example.index_market.entity.product.Category;

public class ProductUpdateDto extends GenericDto {
    private Integer count;
    private Double price;
    private String description;
    private Double disPrice;
    private String size;
    private Double hieght;
    private String frameUz;
    private String frameRu;
    private Category category;
    private String status;
    private String imageUrl;
}
