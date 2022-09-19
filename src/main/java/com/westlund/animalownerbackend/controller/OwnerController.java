package com.westlund.animalownerbackend.controller;

import com.westlund.animalownerbackend.model.Owner;
import com.westlund.animalownerbackend.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/all")
    public ResponseEntity<List<Owner>> getAllOwners(){
        return new ResponseEntity<List<Owner>>(ownerService.getAllOwners(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Owner> saveOwner(@RequestBody Owner owner){
        return new ResponseEntity<Owner>(ownerService.saveOwner(owner), HttpStatus.CREATED);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Owner> findOwnerById(@PathVariable("id") long id){
        return new ResponseEntity<Owner>(ownerService.findOwnerById(id), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Owner> updateOwner(@RequestBody Owner owner, @PathVariable("id") long id){
        return new ResponseEntity<Owner>(ownerService.updateOwner(owner, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteOwnerById(@PathVariable("id") long id){
        return new ResponseEntity<String>(ownerService.deleteOwnerById(id), HttpStatus.OK);
    }

}
