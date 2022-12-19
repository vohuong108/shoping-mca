package vv.huong.Order.Service.MCA.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vv.huong.Order.Service.MCA.entity.Order;
import vv.huong.Order.Service.MCA.repository.OrderRepo;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepo orderRepo;

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody String name) {
        orderRepo.save(new Order(null, name));

        return ResponseEntity.ok().body("created done");
    }
}
