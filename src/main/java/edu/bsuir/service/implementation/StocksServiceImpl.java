package edu.bsuir.service.implementation;

import edu.bsuir.model.Stocks;
import edu.bsuir.repository.StocksRepository;
import edu.bsuir.service.StocksService;
import org.springframework.beans.factory.annotation.Autowired;

public class StocksServiceImpl implements StocksService{

    @Autowired
    private StocksRepository stocksRepository;

    @Override
    public Stocks addStock(Stocks stock) { return stocksRepository.saveAndFlush(stock); }
}
