package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PizzaOrderDto {

    private Integer id;
    private Integer sizeId;
    private Integer count;
}
