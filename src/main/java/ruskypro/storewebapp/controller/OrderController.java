package ruskypro.storewebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ruskypro.storewebapp.service.OrderService;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> itemsIds) {
        return orderService.addItems(itemsIds);
    }
    @GetMapping("/det")
    public List<Integer> getItems() {
        return orderService.getItems();

    }
}
