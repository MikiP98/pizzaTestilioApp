package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.api;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest.AddPizzaDto;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest.UpdatePizzaDto;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.response.PizzaDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/v1/orders/{order-id}", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaController {

    private PizzaService pizzaService = null;


    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody AddPizzaDto addPizzaDto, @RequestHeader("Access-Token") String token) {
        PizzaDto pizzaDto = pizzaService.addPizza(addPizzaDto, token);
        return ResponseEntity.ok(pizzaDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestBody UpdatePizzaDto updatePizzaDto, @RequestHeader("Access-Token") String token, @PathVariable("id") Integer pizzaId) {

        PizzaDto pizzaDto = pizzaService.updatePizza(updatePizzaDto, token, pizzaId);
        return ResponseEntity.ok(pizzaDto);
    }

    @DeleteMapping("/{id}")
    public void a() {

    }
}
