package com.example.index_market.entity.product;

import com.example.index_market.entity.Auditable;
import com.example.index_market.enums.product.Status;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product extends Auditable {
    private Integer count;
    private Double price;
    private String description;
    private Double disPrice;
    private String size;
    private Double hieght;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Frame frame;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String imageUrl;
}
