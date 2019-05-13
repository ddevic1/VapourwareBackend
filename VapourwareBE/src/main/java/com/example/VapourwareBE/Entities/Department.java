package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="department")
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long departmentId;
    private String name;
    @ManyToMany
    @JoinColumn(name="positionId")
    private List<Position> positions;

    public Department() {
        this.positions = new ArrayList<>();
    }

    public Department(String name) {
        this.name = name;
        this.positions = new ArrayList<>();
    }

    public Department(String name, List<Position> positions) {
        this.name = name;
        this.positions = positions;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", positions=" + positions +
                '}';
    }
}
