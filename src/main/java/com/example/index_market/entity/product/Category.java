package com.example.index_market.entity.product;

import com.example.index_market.entity.Auditable;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Category extends Auditable {
    private String nameUz;
    private String nameRu;
}
