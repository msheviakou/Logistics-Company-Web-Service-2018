package edu.bsuir.service.implementation;

import edu.bsuir.model.Loadings;
import edu.bsuir.repository.LoadingsRepository;
import edu.bsuir.service.LoadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadingsServiceImpl implements LoadingsService {

    @Autowired
    private LoadingsRepository loadingsRepository;

    @Override
    public Loadings addLoading(Loadings loading) { return loadingsRepository.saveAndFlush(loading); }
}
