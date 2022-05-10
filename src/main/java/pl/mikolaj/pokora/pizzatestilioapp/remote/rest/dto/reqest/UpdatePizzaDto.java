package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePizzaDto {

    private String name;
    private List<AddSizeDto> addSizeDtoList;
}
