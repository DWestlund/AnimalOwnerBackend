package com.westlund.animalownerbackend.service;

import com.westlund.animalownerbackend.model.Animal;

import java.util.List;

public interface AnimalServiceInterface {
    List<Animal> getAllAnimals();
    Animal saveAnimal(Animal animal);
    Animal findAnimalById(long id);
    Animal updateAnimal(Animal _animal, long id);
    String deleteAnimalById(long id);
}
