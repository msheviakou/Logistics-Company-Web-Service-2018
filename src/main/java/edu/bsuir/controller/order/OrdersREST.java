package edu.bsuir.controller.order;

import edu.bsuir.model.Orders;
import edu.bsuir.service.implementation.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersREST {

    @Autowired
    private OrdersServiceImpl ordersService;

    @RequestMapping(value = "/order",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public Orders addOrder(@RequestBody Orders order) {
        return ordersService.addOrder(order);
    }

    @RequestMapping(value = "/orders",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public List<Orders> getOrders() {
        return ordersService.getOrders();
    }

    @RequestMapping(value = "/order/{orderId}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public Orders getOrder(@PathVariable("orderId") String orderId) {
        return ordersService.getOrder(Integer.parseInt(orderId));
    }

    @RequestMapping(value = "/order/{orderId}",
            method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public void deleteOrder(@PathVariable("orderId") String orderId) {
        ordersService.deleteOrder(Integer.parseInt(orderId));
    }

    @RequestMapping(value = "/order/last",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public Orders getLastOrder() {
        return ordersService.getLastOrder();
    }

    @RequestMapping(value = "/order/edit",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public Orders editOrder(@RequestBody Orders order) {
        return ordersService.editOrder(order);
    }
}
