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

    /*@Autowired
    private CarriersServiceImpl carriersService;

    @Autowired
    private CargosServiceImpl cargosService;

    @Autowired
    private LoadingsServiceImpl loadingsService;

    @Autowired
    private UnloadingsServiceImpl unloadingsService;

    @Autowired
    private UsersServiceImpl usersService;*/

    @Override
    public Orders addOrder(Orders order) {
        /*Carriers carriers = carriersService.addCarrier(order.getCarrier());
        order.setCarrier(carriers);

        Cargos cargos = cargosService.addCargo(order.getCargo());
        order.setCargo(cargos);

        Loadings loadings = loadingsService.addLoading(order.getLoading());
        order.setLoading(loadings);

        Unloadings unloadings = unloadingsService.addUnloading(order.getUnloading());
        order.setUnloading(unloadings);

        Users userForwarderBY = usersService.getUserByName(order.getUserForwarderBY().getName());
        order.setUserForwarderBY(userForwarderBY);

        Users userForwarderPL = usersService.getUserByName(order.getUserForwarderPL().getName());
        order.setUserForwarderBY(userForwarderPL);*/

        return ordersRepository.saveAndFlush(order); }
}
