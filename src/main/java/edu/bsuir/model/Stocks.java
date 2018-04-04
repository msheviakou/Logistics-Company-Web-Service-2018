package edu.bsuir.model;

import javax.persistence.*;

@Entity
@Table(name = "stocks", schema = "logisticcompanyservice")
public class Stocks {
    private int id;
    private String stockName;
    private String stockAdress;
    private String stockPostalCode;
    private String stockCity;
    private String stockCountry;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stockName")
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Basic
    @Column(name = "stockAdress")
    public String getStockAdress() {
        return stockAdress;
    }

    public void setStockAdress(String stockAdress) {
        this.stockAdress = stockAdress;
    }

    @Basic
    @Column(name = "stockPostalCode")
    public String getStockPostalCode() {
        return stockPostalCode;
    }

    public void setStockPostalCode(String stockPostalCode) {
        this.stockPostalCode = stockPostalCode;
    }

    @Basic
    @Column(name = "stockCity")
    public String getStockCity() {
        return stockCity;
    }

    public void setStockCity(String stockCity) {
        this.stockCity = stockCity;
    }

    @Basic
    @Column(name = "stockCountry")
    public String getStockCountry() {
        return stockCountry;
    }

    public void setStockCountry(String stockCountry) {
        this.stockCountry = stockCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stocks that = (Stocks) o;

        if (id != that.id) return false;
        if (stockName != null ? !stockName.equals(that.stockName) : that.stockName != null) return false;
        if (stockAdress != null ? !stockAdress.equals(that.stockAdress) : that.stockAdress != null) return false;
        if (stockPostalCode != null ? !stockPostalCode.equals(that.stockPostalCode) : that.stockPostalCode != null)
            return false;
        if (stockCity != null ? !stockCity.equals(that.stockCity) : that.stockCity != null) return false;
        if (stockCountry != null ? !stockCountry.equals(that.stockCountry) : that.stockCountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (stockName != null ? stockName.hashCode() : 0);
        result = 31 * result + (stockAdress != null ? stockAdress.hashCode() : 0);
        result = 31 * result + (stockPostalCode != null ? stockPostalCode.hashCode() : 0);
        result = 31 * result + (stockCity != null ? stockCity.hashCode() : 0);
        result = 31 * result + (stockCountry != null ? stockCountry.hashCode() : 0);
        return result;
    }
}
