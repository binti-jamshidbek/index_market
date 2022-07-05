package com.example.index_market.entity.order;

import com.example.index_market.entity.Auditable;
import com.example.index_market.entity.auth.AuthUser;
import com.example.index_market.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order extends Auditable {
    @ManyToOne
    private AuthUser user;
    @ManyToOne
    private Product product;
    private LocalDateTime time;
    private boolean arrived;
}
