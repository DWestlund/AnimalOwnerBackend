package com.westlund.animalownerbackend.controller;

import com.westlund.animalownerbackend.model.Animal;
import com.westlund.animalownerbackend.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public ResponseEntity<List<Animal>> getAllAnimals(){
        return new ResponseEntity<List<Animal>>(animalService.getAllAnimals(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Animal> saveAnimal(@RequestBody Animal animal){
        return new ResponseEntity<Animal>(animalService.saveAnimal(animal), HttpStatus.CREATED);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Animal> findAnimalById(@PathVariable("id") long id){
        return new ResponseEntity<Animal>(animalService.findAnimalById(id), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Animal> updateAnimal(@RequestBody Animal animal, @PathVariable("id") long id){
        return new ResponseEntity<Animal>(animalService.updateAnimal(animal, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteAnimalById(@PathVariable("id") long id){
        return new ResponseEntity<String>(animalService.deleteAnimalById(id), HttpStatus.OK);
    }
}
