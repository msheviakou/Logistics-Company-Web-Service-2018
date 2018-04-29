package edu.bsuir.service.implementation;

import edu.bsuir.model.*;
import edu.bsuir.repository.*;
import edu.bsuir.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private UsersServiceImpl usersService;

    @Override
    public Orders addOrder(Orders order) {

        Users userForwarderBY = usersService.getUserByName(order.getUserForwarderBY().getName());
        order.setUserForwarderBY(userForwarderBY);

        Users userForwarderPL = usersService.getUser(order.getUserForwarderPL().getId());
        order.setUserForwarderPL(userForwarderPL);

        return ordersRepository.saveAndFlush(order);
    }

    @Override
    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders getOrder(int id) {
        return ordersRepository.getOne(id);
    }

    @Override
    public void deleteOrder(int id) {
        ordersRepository.deleteById(id);
    }

    @Override
    public Orders getLastOrder() {
        Optional<Orders> isOrder = ordersRepository.findFirstByOrderByIdDesc();
        if (isOrder.isPresent())
            return isOrder.get();
        Orders order = new Orders();
        order.setNumberOfOrder("000000");
        return order;
    }
}
