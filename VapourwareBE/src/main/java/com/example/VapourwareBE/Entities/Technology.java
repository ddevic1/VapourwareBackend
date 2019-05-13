package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="technology")
public class Technology implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long technologyId;
    private String name;
    @ManyToOne
    @JoinColumn(name="technologyTypeId")
    private TechnologyType technologyType;

    public Technology() {

    }

    public Technology(String name) {
        this.name = name;
    }

    public Technology(String name, TechnologyType technologyType) {
        this.name = name;
        this.technologyType = technologyType;
    }

    public Long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
        this.technologyId = technologyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    public void setTechnologyType(TechnologyType technologyType) {
        this.technologyType = technologyType;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "technologyId=" + technologyId +
                ", name='" + name + '\'' +
                ", technologyType=" + technologyType +
                '}';
    }
}
