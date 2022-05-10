package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderDto {

    private Integer id;

    public Arrays getPizzas() {
        return null;
    }

    public PersonOrderDto getPersonOrderDto() {
        return null;
    }
}
