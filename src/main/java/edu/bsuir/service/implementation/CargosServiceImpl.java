package edu.bsuir.service.implementation;

import edu.bsuir.model.Cargos;
import edu.bsuir.repository.CargosRepository;
import edu.bsuir.service.CargosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargosServiceImpl implements CargosService{

    @Autowired
    private CargosRepository cargosRepository;

    @Override
    public Cargos addCargo(Cargos cargo) { return cargosRepository.saveAndFlush(cargo); }
}
