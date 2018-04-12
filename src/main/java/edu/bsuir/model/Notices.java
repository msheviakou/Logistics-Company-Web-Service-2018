package edu.bsuir.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "notices", schema = "logisticcompanyservice")
public class Notices implements Serializable{
    private int id;
    private Date dateOfLoading;
    private String typeOfRollingStock;
    private String placeOfCustomsClearance;
    private String orderOfLoading;
    private String transportDocument;
    private String status;

    private Drivers driver;
    private Users forwarder;

    public Notices() {}

    public Notices(int id, Date dateOfLoading, String typeOfRollingStock, String placeOfCustomsClearance, String orderOfLoading, String transportDocument, String status, Drivers driver, Users forwarder) {
        this.id = id;
        this.dateOfLoading = dateOfLoading;
        this.typeOfRollingStock = typeOfRollingStock;
        this.placeOfCustomsClearance = placeOfCustomsClearance;
        this.orderOfLoading = orderOfLoading;
        this.transportDocument = transportDocument;
        this.status = status;
        this.driver = driver;
        this.forwarder = forwarder;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateOfLoading")
    public Date getDateOfLoading() {
        return dateOfLoading;
    }

    public void setDateOfLoading(Date dateOfLoading) {
        this.dateOfLoading = dateOfLoading;
    }

    @Basic
    @Column(name = "typeOfRollingStock")
    public String getTypeOfRollingStock() {
        return typeOfRollingStock;
    }

    public void setTypeOfRollingStock(String typeOfRollingStock) {
        this.typeOfRollingStock = typeOfRollingStock;
    }

    @Basic
    @Column(name = "placeOfCustomsClearance")
    public String getPlaceOfCustomsClearance() {
        return placeOfCustomsClearance;
    }

    public void setPlaceOfCustomsClearance(String placeOfCustomsClearance) {
        this.placeOfCustomsClearance = placeOfCustomsClearance;
    }

    @Basic
    @Column(name = "orderOfLoading")
    public String getOrderOfLoading() {
        return orderOfLoading;
    }

    public void setOrderOfLoading(String orderOfLoading) {
        this.orderOfLoading = orderOfLoading;
    }

    @Basic
    @Column(name = "transportDocument")
    public String getTransportDocument() {
        return transportDocument;
    }

    public void setTransportDocument(String transportDocument) {
        this.transportDocument = transportDocument;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     Related Entities
     **/

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "forwarder_id", referencedColumnName = "id", nullable = false)
    public Users getForwarder() {
        return forwarder;
    }

    public void setForwarder(Users forwarder) {
        this.forwarder = forwarder;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id", referencedColumnName = "id", nullable = false)
    public Drivers getDriver() {
        return driver;
    }

    public void setDriver(Drivers driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notices that = (Notices) o;

        if (id != that.id) return false;
        if (dateOfLoading != null ? !dateOfLoading.equals(that.dateOfLoading) : that.dateOfLoading != null)
            return false;
        if (typeOfRollingStock != null ? !typeOfRollingStock.equals(that.typeOfRollingStock) : that.typeOfRollingStock != null)
            return false;
        if (placeOfCustomsClearance != null ? !placeOfCustomsClearance.equals(that.placeOfCustomsClearance) : that.placeOfCustomsClearance != null)
            return false;
        if (orderOfLoading != null ? !orderOfLoading.equals(that.orderOfLoading) : that.orderOfLoading != null)
            return false;
        if (transportDocument != null ? !transportDocument.equals(that.transportDocument) : that.transportDocument != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateOfLoading != null ? dateOfLoading.hashCode() : 0);
        result = 31 * result + (typeOfRollingStock != null ? typeOfRollingStock.hashCode() : 0);
        result = 31 * result + (placeOfCustomsClearance != null ? placeOfCustomsClearance.hashCode() : 0);
        result = 31 * result + (orderOfLoading != null ? orderOfLoading.hashCode() : 0);
        result = 31 * result + (transportDocument != null ? transportDocument.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
