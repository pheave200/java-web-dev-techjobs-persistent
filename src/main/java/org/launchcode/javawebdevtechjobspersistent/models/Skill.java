package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 150, message = "Description must be fewer than 150 characters")
    @NotBlank(message = "Skill cannot be blank.")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}