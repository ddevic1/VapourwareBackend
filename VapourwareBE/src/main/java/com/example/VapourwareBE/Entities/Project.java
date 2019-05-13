package com.example.VapourwareBE.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long projectId;
    private String name;
    private String description;
    @ManyToMany
    @JoinColumn(name="technologyId")
    private List<Technology> technologies;
    @OneToMany
    @JoinColumn(name="consultantId")
    private List<Consultant> consultants;

    public Project() {
        this.consultants = new ArrayList<>();
        this.technologies = new ArrayList<>();
    }

    public Project(String name) {
        this.name = name;
        this.consultants = new ArrayList<>();
        this.technologies = new ArrayList<>();
    }

    public Project(String name, String description, List<Technology> technologies, List<Consultant> consultants) {
        this.name = name;
        this.description = description;
        this.technologies = technologies;
        this.consultants = consultants;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
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

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public List<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(List<Consultant> consultants) {
        this.consultants = consultants;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", technologies=" + technologies +
                ", consultants=" + consultants +
                '}';
    }
}
