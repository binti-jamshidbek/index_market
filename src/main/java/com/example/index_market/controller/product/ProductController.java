package com.example.index_market.controller.product;

import com.example.index_market.controller.AbstractController;
import com.example.index_market.service.product.ProductServiceImpl;

public class ProductController extends AbstractController<ProductServiceImpl> {
    public ProductController(ProductServiceImpl service) {
        super(service);
    }
}
