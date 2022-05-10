package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddSizeDto {

    private String name;
    @JsonProperty("sizes")
    private List<AddPizzaDto> addPizzaDtoList;




    public <E extends Enum<E>> Enum<E> getSize() {
        return null;
    }

    public Object getPrice() {
        return null;
    }
}
