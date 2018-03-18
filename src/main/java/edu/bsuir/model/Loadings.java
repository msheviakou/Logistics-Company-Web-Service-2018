package edu.bsuir.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "loadings", schema = "logisticcompanyservice")
public class Loadings {
    private int id;
    private String loadingCompanyName;
    private String loadingAdress;
    private String loadingPostalCode;
    private String loadingCity;
    private String loadingCountry;
    private Date loadingDate;
    private Time loadingTime;

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
    @Column(name = "loadingCompanyName")
    public String getLoadingCompanyName() {
        return loadingCompanyName;
    }

    public void setLoadingCompanyName(String loadingCompanyName) {
        this.loadingCompanyName = loadingCompanyName;
    }

    @Basic
    @Column(name = "loadingAdress")
    public String getLoadingAdress() {
        return loadingAdress;
    }

    public void setLoadingAdress(String loadingAdress) {
        this.loadingAdress = loadingAdress;
    }

    @Basic
    @Column(name = "loadingPostalCode")
    public String getLoadingPostalCode() {
        return loadingPostalCode;
    }

    public void setLoadingPostalCode(String loadingPostalCode) {
        this.loadingPostalCode = loadingPostalCode;
    }

    @Basic
    @Column(name = "loadingCity")
    public String getLoadingCity() {
        return loadingCity;
    }

    public void setLoadingCity(String loadingCity) {
        this.loadingCity = loadingCity;
    }

    @Basic
    @Column(name = "loadingCountry")
    public String getLoadingCountry() {
        return loadingCountry;
    }

    public void setLoadingCountry(String loadingCountry) {
        this.loadingCountry = loadingCountry;
    }

    @Basic
    @Column(name = "loadingDate")
    public Date getLoadingDate() {
        return loadingDate;
    }

    public void setLoadingDate(Date loadingDate) {
        this.loadingDate = loadingDate;
    }

    @Basic
    @Column(name = "loadingTime")
    public Time getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(Time loadingTime) {
        this.loadingTime = loadingTime;
    }

    /**
     Related Entities
     **/

    @OneToOne(optional = true, mappedBy = "loading")
    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Loadings that = (Loadings) o;

        if (id != that.id) return false;
        if (loadingCompanyName != null ? !loadingCompanyName.equals(that.loadingCompanyName) : that.loadingCompanyName != null)
            return false;
        if (loadingAdress != null ? !loadingAdress.equals(that.loadingAdress) : that.loadingAdress != null)
            return false;
        if (loadingPostalCode != null ? !loadingPostalCode.equals(that.loadingPostalCode) : that.loadingPostalCode != null)
            return false;
        if (loadingCity != null ? !loadingCity.equals(that.loadingCity) : that.loadingCity != null) return false;
        if (loadingCountry != null ? !loadingCountry.equals(that.loadingCountry) : that.loadingCountry != null)
            return false;
        if (loadingDate != null ? !loadingDate.equals(that.loadingDate) : that.loadingDate != null) return false;
        if (loadingTime != null ? !loadingTime.equals(that.loadingTime) : that.loadingTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (loadingCompanyName != null ? loadingCompanyName.hashCode() : 0);
        result = 31 * result + (loadingAdress != null ? loadingAdress.hashCode() : 0);
        result = 31 * result + (loadingPostalCode != null ? loadingPostalCode.hashCode() : 0);
        result = 31 * result + (loadingCity != null ? loadingCity.hashCode() : 0);
        result = 31 * result + (loadingCountry != null ? loadingCountry.hashCode() : 0);
        result = 31 * result + (loadingDate != null ? loadingDate.hashCode() : 0);
        result = 31 * result + (loadingTime != null ? loadingTime.hashCode() : 0);
        return result;
    }
}
