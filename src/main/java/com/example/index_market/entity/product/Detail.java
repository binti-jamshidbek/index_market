package com.example.index_market.entity.product;

import com.example.index_market.entity.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Detail extends Auditable {
    private String nameUz;
    private String nameRu;
}
