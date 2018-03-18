package edu.bsuir.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "orders", schema = "logisticcompanyservice")
public class Orders {
    private int id;
    private Date dateOfOrder;
    private String numberOfOrder;
    private String orderStatus;
    private Double freightCost;
    private String paymentPeriod;
    private String additionalInformation;

    private Carriers carrier;
    private Cargos cargo;
    private Loadings loading;
    private Unloadings unloading;
    private Notices notice;
    private Users userForwarderBY;
    private Users userForwarderPL;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateOfOrder")
    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @Basic
    @Column(name = "numberOfOrder")
    public String getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(String numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    @Basic
    @Column(name = "orderStatus")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "freightCost")
    public Double getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(Double freightCost) {
        this.freightCost = freightCost;
    }

    @Basic
    @Column(name = "paymentPeriod")
    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    @Basic
    @Column(name = "additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     Related Entities
     **/

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "carrierID")
    public Carriers getCarrier() {
        return carrier;
    }

    public void setCarrier(Carriers carrier) {
        this.carrier = carrier;
    }

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "cargoID")
    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "loadingID")
    public Loadings getLoading() {
        return loading;
    }

    public void setLoading(Loadings loading) {
        this.loading = loading;
    }

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "unloadingID")
    public Unloadings getUnloading() {
        return unloading;
    }

    public void setUnloading(Unloadings unloading) {
        this.unloading = unloading;
    }

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "noticeID")
    public Notices getNotice() {
        return notice;
    }

    public void setNotice (Notices notice) {
        this.notice = notice;
    }

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "orderBYforwarderID")
    public Users getUserForwarderBY() {
        return userForwarderBY;
    }

    public void setUserForwarderBY (Users userForwarderBY) {
        this.userForwarderBY = userForwarderBY;
    }

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "orderPLforwarderID")
    public Users getUserForwarderPL() {
        return userForwarderPL;
    }

    public void setUserForwarderPL (Users userForwarderPL) {
        this.userForwarderPL = userForwarderPL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders that = (Orders) o;

        if (id != that.id) return false;
        if (dateOfOrder != null ? !dateOfOrder.equals(that.dateOfOrder) : that.dateOfOrder != null) return false;
        if (numberOfOrder != null ? !numberOfOrder.equals(that.numberOfOrder) : that.numberOfOrder != null)
            return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (freightCost != null ? !freightCost.equals(that.freightCost) : that.freightCost != null) return false;
        if (paymentPeriod != null ? !paymentPeriod.equals(that.paymentPeriod) : that.paymentPeriod != null)
            return false;
        if (additionalInformation != null ? !additionalInformation.equals(that.additionalInformation) : that.additionalInformation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateOfOrder != null ? dateOfOrder.hashCode() : 0);
        result = 31 * result + (numberOfOrder != null ? numberOfOrder.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (freightCost != null ? freightCost.hashCode() : 0);
        result = 31 * result + (paymentPeriod != null ? paymentPeriod.hashCode() : 0);
        result = 31 * result + (additionalInformation != null ? additionalInformation.hashCode() : 0);
        return result;
    }
}
