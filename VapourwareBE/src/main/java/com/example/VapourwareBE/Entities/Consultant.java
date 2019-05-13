package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="consultant")
public class Consultant implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long consultantId;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Long salary;
    @ManyToMany
    @JoinColumn(name="technologyId")
    private List<Technology> technologies;
    @ManyToOne
    @JoinColumn(name="positionId")
    private Position position;
    @OneToMany
    @JoinColumn(name="projectId")
    private List<Project> projects;
    @OneToOne
    @JoinColumn(name="contractId")
    private Contract contract;

    public Consultant() {
        this.projects = new ArrayList<>();
        this.technologies = new ArrayList<>();
    }

    public Consultant(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
        this.technologies = new ArrayList<>();
    }

    public Consultant(String name, String surname, String email, String phone, Long salary, List<Technology> technologies, Position position, List<Project> projects, Contract contract) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.technologies = technologies;
        this.position = position;
        this.projects = projects;
        this.contract = contract;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "consultantId=" + consultantId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", technologies=" + technologies +
                ", position=" + position +
                ", projects=" + projects +
                ", contract=" + contract +
                '}';
    }
}
