package com.westlund.animalownerbackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private long ownerId;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "age")
    private long age;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id_fk", referencedColumnName = "address_id")
    private Address address;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "owners_animals",
            joinColumns = @JoinColumn(name = "owner_id_fk"),
            inverseJoinColumns = @JoinColumn(name = "animal_id_fk")
    )
    private List<Animal> animals;

    public Owner() {
    }
    public Owner(String firstname, String lastname, long age, Address address, List<Animal> animals) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.animals = animals;
    }
    public Owner(long ownerId, String firstname, String lastname, long age, Address address, List<Animal> animals) {
        this.ownerId = ownerId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.animals = animals;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getAge() {
        return age;
    }
    public void setAge(long age) {
        this.age = age;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
