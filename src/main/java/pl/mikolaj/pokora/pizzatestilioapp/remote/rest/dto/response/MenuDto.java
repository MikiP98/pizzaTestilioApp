package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuDto {

    private List<PizzaDto> pizzas;
}
