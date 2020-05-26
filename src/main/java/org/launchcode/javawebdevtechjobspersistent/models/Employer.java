package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Lacation cannot be empty")
    private String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
