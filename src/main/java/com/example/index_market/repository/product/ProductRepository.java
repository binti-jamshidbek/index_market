package com.example.index_market.repository.product;

import com.example.index_market.entity.product.Product;
import com.example.index_market.repository.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends AbstractRepository, JpaRepository<Product,String> {
}
