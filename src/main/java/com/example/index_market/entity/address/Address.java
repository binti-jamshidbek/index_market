package com.example.index_market.entity.address;

import com.example.index_market.entity.Auditable;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address extends Auditable {
    private Double lat;
    private Double lang;
}
