package edu.bsuir.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "drivers", schema = "logisticcompanyservice")
public class Drivers implements Serializable{
    private int id;
    private String phoneNumber;
    private String name;
    private String trukRegNumber;

    public Drivers() {}

    public Drivers(int id, String phoneNumber, String name, String trukRegNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.trukRegNumber = trukRegNumber;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "trukRegNumber")
    public String getTrukRegNumber() {
        return trukRegNumber;
    }

    public void setTrukRegNumber(String trukRegNumber) {
        this.trukRegNumber = trukRegNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drivers that = (Drivers) o;

        if (id != that.id) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (trukRegNumber != null ? !trukRegNumber.equals(that.trukRegNumber) : that.trukRegNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (trukRegNumber != null ? trukRegNumber.hashCode() : 0);
        return result;
    }
}
