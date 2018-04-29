package edu.bsuir.controller.stock;

import edu.bsuir.model.Stocks;
import edu.bsuir.service.implementation.StocksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StocksREST {

  @Autowired
  private StocksServiceImpl stocksService;

  @RequestMapping(value = "/stock",
          method = RequestMethod.POST,
          produces = { MediaType.APPLICATION_JSON_VALUE,
                  MediaType.APPLICATION_XML_VALUE })
  public Stocks addStock(@RequestBody Stocks stock) { return stocksService.addStock(stock); }

  @RequestMapping(value = "/stocks",
          method = RequestMethod.GET,
          produces = { MediaType.APPLICATION_JSON_VALUE,
                  MediaType.APPLICATION_XML_VALUE })
  public List<Stocks> getStocks() { return stocksService.getStocks(); }

  @RequestMapping(value = "/stock/{stockId}",
          method = RequestMethod.GET,
          produces = { MediaType.APPLICATION_JSON_VALUE,
                  MediaType.APPLICATION_XML_VALUE })
  public Stocks getStock(@PathVariable("stockId") String stockId) { return stocksService.getStock(Integer.parseInt(stockId));}
}
