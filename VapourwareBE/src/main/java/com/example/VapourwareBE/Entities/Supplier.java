package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="supplier")
public class Supplier implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long supplierId;
    private String name;
    @ManyToOne
    @JoinColumn(name="locationId")
    private Location location;
    @OneToOne
    @JoinColumn(name="contractId")
    private Contract contract;

    public Supplier() {
    }

    public Supplier(String name) {
        this.name = name;
    }

    public Supplier(String name, Location location, Contract contract) {
        this.name = name;
        this.location = location;
        this.contract = contract;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", contract=" + contract +
                '}';
    }
}
