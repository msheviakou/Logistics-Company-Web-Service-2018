package edu.bsuir.service.implementation;

import edu.bsuir.model.Carriers;
import edu.bsuir.model.Drivers;
import edu.bsuir.repository.CarriersRepository;
import edu.bsuir.repository.DriversRepository;
import edu.bsuir.service.CarriersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarriersServiceImpl implements CarriersService {

    @Autowired
    private CarriersRepository carriersRepository;

    @Override
    public Carriers addCarrier(Carriers carrier) { return carriersRepository.saveAndFlush(carrier); }
}
