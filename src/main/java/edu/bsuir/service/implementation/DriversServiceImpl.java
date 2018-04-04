package edu.bsuir.service.implementation;

import edu.bsuir.model.Drivers;
import edu.bsuir.repository.DriversRepository;
import edu.bsuir.service.DriversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriversServiceImpl implements DriversService {

    @Autowired
    private DriversRepository driversRepository;

    @Override
    public Drivers addDriver(Drivers driver) { return driversRepository.saveAndFlush(driver); }
}
