package edu.bsuir.service.implementation;

import edu.bsuir.model.*;
import edu.bsuir.repository.*;
import edu.bsuir.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private UsersServiceImpl usersService;

    @Override
    public Orders addOrder(Orders order) {

        Users userForwarderBY = usersService.getUserByName(order.getUserForwarderBY().getName());
        order.setUserForwarderBY(userForwarderBY);

        Users userForwarderPL = usersService.getUserByName(order.getUserForwarderPL().getName());
        order.setUserForwarderBY(userForwarderPL);

        return ordersRepository.saveAndFlush(order);
    }
}
