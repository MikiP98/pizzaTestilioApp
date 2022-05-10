package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mikolaj.pokora.pizzatestilioapp.domain.model.OrderStatusType;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest.PersonOrderDto;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest.PizzaOrderDto;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;
}
