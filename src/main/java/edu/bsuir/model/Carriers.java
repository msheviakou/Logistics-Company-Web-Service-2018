package edu.bsuir.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carriers", schema = "logisticcompanyservice")
public class Carriers {
    private int id;
    private String carrierCompanyName;
    private String carrierContact;
    private String carrierTelephone;
    private String carrierElMail;

    private Drivers driver;

    @OneToMany(mappedBy = "carrier", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Orders> orders;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "carrierCompanyName")
    public String getCarrierCompanyName() {
        return carrierCompanyName;
    }

    public void setCarrierCompanyName(String carrierCompanyName) {
        this.carrierCompanyName = carrierCompanyName;
    }

    @Basic
    @Column(name = "carrierContact")
    public String getCarrierContact() {
        return carrierContact;
    }

    public void setCarrierContact(String carrierContact) {
        this.carrierContact = carrierContact;
    }

    @Basic
    @Column(name = "carrierTelephone")
    public String getCarrierTelephone() {
        return carrierTelephone;
    }

    public void setCarrierTelephone(String carrierTelephone) {
        this.carrierTelephone = carrierTelephone;
    }

    @Basic
    @Column(name = "carrierElMail")
    public String getCarrierElMail() {
        return carrierElMail;
    }

    public void setCarrierElMail(String carrierElMail) {
        this.carrierElMail = carrierElMail;
    }

    /**
     Related Entities
     **/

    @OneToOne()
    @JoinColumn(name = "driverID", referencedColumnName = "id")
    @JsonBackReference
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

        Carriers that = (Carriers) o;

        if (id != that.id) return false;
        if (carrierCompanyName != null ? !carrierCompanyName.equals(that.carrierCompanyName) : that.carrierCompanyName != null)
            return false;
        if (carrierContact != null ? !carrierContact.equals(that.carrierContact) : that.carrierContact != null)
            return false;
        if (carrierTelephone != null ? !carrierTelephone.equals(that.carrierTelephone) : that.carrierTelephone != null)
            return false;
        if (carrierElMail != null ? !carrierElMail.equals(that.carrierElMail) : that.carrierElMail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (carrierCompanyName != null ? carrierCompanyName.hashCode() : 0);
        result = 31 * result + (carrierContact != null ? carrierContact.hashCode() : 0);
        result = 31 * result + (carrierTelephone != null ? carrierTelephone.hashCode() : 0);
        result = 31 * result + (carrierElMail != null ? carrierElMail.hashCode() : 0);
        return result;
    }
}
