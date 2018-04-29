package edu.bsuir.service;

import edu.bsuir.model.Stocks;

import java.util.List;

public interface StocksService {
    Stocks addStock(Stocks stock);
    List<Stocks> getStocks();
    Stocks getStock(int id);
}
