package edu.bsuir.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "unloadings", schema = "logisticcompanyservice")
public class Unloadings {
    private int id;
    private String unloadingClient;
    private String unloadingCity;
    private String unloadingCountry;
    private Date unloadingDate;
    private Time unloadingTime;

    private Stocks stock;
    private Orders order;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "unloadingClient")
    public String getUnloadingClient() {
        return unloadingClient;
    }

    public void setUnloadingClient(String unloadingClient) {
        this.unloadingClient = unloadingClient;
    }

    @Basic
    @Column(name = "unloadingCity")
    public String getUnloadingCity() {
        return unloadingCity;
    }

    public void setUnloadingCity(String unloadingCity) {
        this.unloadingCity = unloadingCity;
    }

    @Basic
    @Column(name = "unloadingCountry")
    public String getUnloadingCountry() {
        return unloadingCountry;
    }

    public void setUnloadingCountry(String unloadingCountry) {
        this.unloadingCountry = unloadingCountry;
    }

    @Basic
    @Column(name = "unloadingDate")
    public Date getUnloadingDate() {
        return unloadingDate;
    }

    public void setUnloadingDate(Date unloadingDate) {
        this.unloadingDate = unloadingDate;
    }

    @Basic
    @Column(name = "unloadingTime")
    public Time getUnloadingTime() {
        return unloadingTime;
    }

    public void setUnloadingTime(Time unloadingTime) {
        this.unloadingTime = unloadingTime;
    }

    /**
     Related Entities
     **/

    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "unloadingStockID")
    public Stocks getStock() {
        return stock;
    }

    public void setStock(Stocks stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unloadings that = (Unloadings) o;

        if (id != that.id) return false;
        if (unloadingClient != null ? !unloadingClient.equals(that.unloadingClient) : that.unloadingClient != null)
            return false;
        if (unloadingCity != null ? !unloadingCity.equals(that.unloadingCity) : that.unloadingCity != null)
            return false;
        if (unloadingCountry != null ? !unloadingCountry.equals(that.unloadingCountry) : that.unloadingCountry != null)
            return false;
        if (unloadingDate != null ? !unloadingDate.equals(that.unloadingDate) : that.unloadingDate != null)
            return false;
        if (unloadingTime != null ? !unloadingTime.equals(that.unloadingTime) : that.unloadingTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (unloadingClient != null ? unloadingClient.hashCode() : 0);
        result = 31 * result + (unloadingCity != null ? unloadingCity.hashCode() : 0);
        result = 31 * result + (unloadingCountry != null ? unloadingCountry.hashCode() : 0);
        result = 31 * result + (unloadingDate != null ? unloadingDate.hashCode() : 0);
        result = 31 * result + (unloadingTime != null ? unloadingTime.hashCode() : 0);
        return result;
    }
}
