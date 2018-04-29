package edu.bsuir.service.implementation;

import edu.bsuir.model.Stocks;
import edu.bsuir.repository.StocksRepository;
import edu.bsuir.service.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocksServiceImpl implements StocksService{

    @Autowired
    private StocksRepository stocksRepository;

    @Override
    public Stocks addStock(Stocks stock) { return stocksRepository.saveAndFlush(stock); }

    @Override
    public List<Stocks> getStocks() {
        return stocksRepository.findAll();
    }

    @Override
    public Stocks getStock(int id) {
        return stocksRepository.getOne(id);
    }
}
