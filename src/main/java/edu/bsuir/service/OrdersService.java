package edu.bsuir.service;

import edu.bsuir.model.Orders;

import java.util.List;

public interface OrdersService {
    Orders addOrder(Orders order);
    List<Orders> getOrders();
    Orders getOrder(int id);
    void deleteOrder(int id);
    Orders getLastOrder();
    Orders editOrder(Orders order);
}
