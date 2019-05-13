package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "package")
public class Package implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long packageId;
    private String name;
    private String description;

    public Package() {
    }

    public Package(String name) {
        this.name = name;
    }

    public Package(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageId=" + packageId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
