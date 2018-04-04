package edu.bsuir.service.implementation;

import edu.bsuir.model.Orders;
import edu.bsuir.repository.OrdersRepository;
import edu.bsuir.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders addOrder(Orders order) { return ordersRepository.saveAndFlush(order); }
}
