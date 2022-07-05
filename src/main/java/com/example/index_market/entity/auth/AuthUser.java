package com.example.index_market.entity.auth;

import com.example.index_market.entity.Auditable;
import com.example.index_market.entity.address.Address;
import com.example.index_market.enums.user.Role;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AuthUser extends Auditable {
    private String name;
    private String phone;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
