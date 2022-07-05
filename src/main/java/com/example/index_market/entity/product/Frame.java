package com.example.index_market.entity.product;

import com.example.index_market.entity.Auditable;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Frame extends Auditable {
    private String frameUz;
    private String frameRu;
}
