package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="technology_type")
public class TechnologyType implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long technologyTypeId;
    private String name;

    public TechnologyType() {
    }

    public TechnologyType(String name) {
        this.name = name;
    }

    public Long gettechnologyTypeId() {
        return technologyTypeId;
    }

    public void settechnologyTypeId(Long technologyTypeId) {
        this.technologyTypeId = technologyTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TechnologyType{" +
                "technologyTypeId=" + technologyTypeId +
                ", name='" + name + '\'' +
                '}';
    }
}
