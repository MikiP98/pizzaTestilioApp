package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonOrderDto {

    private String name;
    private String phone;
    private String address;
    private Integer floor;
}
