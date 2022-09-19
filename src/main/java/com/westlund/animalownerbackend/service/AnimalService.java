package com.westlund.animalownerbackend.service;

import com.westlund.animalownerbackend.exception.ResourceNotFoundException;
import com.westlund.animalownerbackend.model.Animal;
import com.westlund.animalownerbackend.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements AnimalServiceInterface{

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal findAnimalById(long id) {
        return animalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Animal", "Id", id));
    }

    @Override
    public Animal updateAnimal(Animal _animal, long id) {
        Animal animal = animalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Animal","Id",id));
        if (_animal.getName() != null)
            animal.setName(_animal.getName());
        if (_animal.getAge() > 0)
            animal.setAge(_animal.getAge());
        return animalRepository.save(animal);
    }

    @Override
    public String deleteAnimalById(long id) {
        animalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Animal", "Id", id));
        animalRepository.deleteById(id);
        return "Deleted owner with id: " + id;
    }
}
