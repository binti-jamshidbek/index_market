package com.example.index_market.dto;

import com.example.index_market.entity.Auditable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericDto implements Dto{

    @Schema(description = "Id is UUID as String. Id should be UUID", example = "dd2981f0-917e-432e-9de4-9b65f93b9460", required = true)
    @NotBlank(message = "id not be null")
    private String id;

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Auditable other = (Auditable) obj;
        return Objects.equals(id,other.getId());
    }
}
