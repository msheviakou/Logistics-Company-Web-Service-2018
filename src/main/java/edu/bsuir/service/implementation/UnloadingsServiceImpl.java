package edu.bsuir.service.implementation;

import edu.bsuir.model.Stocks;
import edu.bsuir.model.Unloadings;
import edu.bsuir.repository.UnloadingsRepository;
import edu.bsuir.service.UnloadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnloadingsServiceImpl implements UnloadingsService {

    @Autowired
    private UnloadingsRepository unloadingsRepository;

    @Autowired
    private StocksServiceImpl stocksService;

    @Override
    public Unloadings addUnloading(Unloadings unloading) {
        Stocks stocks = stocksService.addStock(unloading.getStock());
        unloading.setStock(stocks);

        return unloadingsRepository.saveAndFlush(unloading);
    }
}
