package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="contract_type")
public class ContractType implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long contractTypeId;
    private String name;

    public ContractType() {
    }

    public ContractType(String name) {
        this.name = name;
    }

    public Long getContractTypeId() {
        return contractTypeId;
    }

    public void setContractTypeId(Long contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContractType{" +
                "contractTypeId=" + contractTypeId +
                ", name='" + name + '\'' +
                '}';
    }
}
