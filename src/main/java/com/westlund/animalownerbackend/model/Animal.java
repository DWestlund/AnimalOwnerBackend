package com.westlund.animalownerbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id")
    private long animalId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @JsonIgnore//För att inte det ska bli rundgång
    @ManyToMany(mappedBy = "animals")
    private List<Owner> owners;

    public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(String name, int age, List<Owner> owners) {
        this.name = name;
        this.age = age;
        this.owners = owners;
    }

    public long getAnimalId() {
        return animalId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public List<Owner> getOwners() {
        return owners;
    }
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }
}
