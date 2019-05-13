package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="hardware")
public class Hardware implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long hardwareId;
    private String name;
    private String type;
    private Long serialNumber;
    private Long cost;
    private int amount;
    @ManyToOne
    @JoinColumn(name="supplierId")
    private Supplier supplier;

    public Hardware() {
    }

    public Hardware(String name) {
        this.name = name;
    }

    public Hardware(String name, String type, Long serialNumber, Long cost, int amount, Supplier supplier) {
        this.name = name;
        this.type = type;
        this.serialNumber = serialNumber;
        this.cost = cost;
        this.amount = amount;
        this.supplier = supplier;
    }

    public Long getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(Long hardwareId) {
        this.hardwareId = hardwareId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "hardwareId=" + hardwareId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", serialNumber=" + serialNumber +
                ", cost=" + cost +
                ", amount=" + amount +
                ", supplier=" + supplier +
                '}';
    }
}
