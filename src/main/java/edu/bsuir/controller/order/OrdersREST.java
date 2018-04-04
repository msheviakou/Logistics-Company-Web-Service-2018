package edu.bsuir.controller.order;

import edu.bsuir.model.Orders;
import edu.bsuir.service.implementation.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersREST {

    @Autowired
    private OrdersServiceImpl ordersService;

    @RequestMapping(value = "/order",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                         MediaType.APPLICATION_XML_VALUE })
    public Orders addOrder(@RequestBody Orders order) { return ordersService.addOrder(order); }
}
