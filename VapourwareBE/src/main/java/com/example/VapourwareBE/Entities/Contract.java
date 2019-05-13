package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="contract")
public class Contract implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long contractId;
    private String name;
    @ManyToOne
    @JoinColumn(name="contractTypeId")
    private ContractType contractType;

    public Contract() {
    }

    public Contract(String name) {
        this.name = name;
    }

    public Contract(String name, ContractType contractType) {
        this.name = name;
        this.contractType = contractType;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", name='" + name + '\'' +
                ", contractType=" + contractType +
                '}';
    }
}
