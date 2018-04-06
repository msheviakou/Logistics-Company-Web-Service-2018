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
    private CarriersRepository carriersRepository;

    @Autowired
    private CargosRepository cargosRepository;

    @Autowired
    private LoadingsRepository loadingsRepository;

    @Autowired
    private UnloadingsRepository unloadingsRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Orders addOrder(Orders order) {
        Carriers carriers = carriersRepository.save(order.getCarrier());
        order.setCarrier(carriers);

        Cargos cargos = cargosRepository.save(order.getCargo());
        order.setCargo(cargos);

        Loadings loadings = loadingsRepository.save(order.getLoading());
        order.setLoading(loadings);

        Unloadings unloadings = unloadingsRepository.save(order.getUnloading());
        order.setUnloading(unloadings);

        Users userForwarderBY = usersRepository.save(order.getUserForwarderBY());
        order.setUserForwarderBY(userForwarderBY);

        Users userForwarderPL = usersRepository.getUserByName(order.getUserForwarderPL().getName());
        order.setUserForwarderBY(userForwarderPL);

        return ordersRepository.saveAndFlush(order); }
}
