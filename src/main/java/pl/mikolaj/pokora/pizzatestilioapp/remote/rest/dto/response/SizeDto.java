package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mikolaj.pokora.pizzatestilioapp.domain.model.SizeType;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SizeDto {

    private Integer id;
    private SizeType size;
    private BigDecimal price;
}
