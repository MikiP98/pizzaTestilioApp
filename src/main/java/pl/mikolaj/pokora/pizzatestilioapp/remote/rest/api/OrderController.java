package pl.mikolaj.pokora.pizzatestilioapp.remote.rest.api;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mikolaj.pokora.pizzatestilioapp.domain.model.OrderStatusType;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.reqest.AddOrderDto;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.response.OrderCollectionDto;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.response.OrderStatusDto;
import pl.mikolaj.pokora.pizzatestilioapp.remote.rest.dto.response.TokenDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {

    private GetOrderService getOrderService;


    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto) {
        //TokenDto tokenDto = addOrderService.addOrder(addOrderDto);
        return ResponseEntity.ok(null);
    }


    @GetMapping("/status/{token}")
    public ResponseEntity<OrderStatusDto> getStatus(@PathVariable("token") String token) {
        OrderStatusDto orderStatusDto = getOrderService.getOrderStatus(token);

        return ResponseEntity.ok(orderStatusDto);
    }


    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status") OrderStatusType orderStatus, @RequestHeader("Acces-Token") String token) {

        //OrderCollectionDto orderCollectionDto = getOrderService.getOrderByStatus(orderStatus, token);
        return ResponseEntity.ok(null);
    }
}
