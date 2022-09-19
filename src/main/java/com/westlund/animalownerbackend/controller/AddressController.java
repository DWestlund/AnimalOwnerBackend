package com.westlund.animalownerbackend.controller;

import com.westlund.animalownerbackend.model.Address;
import com.westlund.animalownerbackend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAllAddresses(){
        return new ResponseEntity<List<Address>>(addressService.getAllAddresses(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        return new ResponseEntity<>(addressService.saveAddress(address), HttpStatus.CREATED);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Address> findAddressById(@PathVariable long id){
        return new ResponseEntity<>(addressService.findAddressById(id), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Address> updateAddress(@RequestBody Address address, @PathVariable("id") long id){
        return new ResponseEntity<Address>(addressService.updateAddress(address, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteAddressById(@PathVariable("id") long id){
        return new ResponseEntity<String>(addressService.deleteAddressById(id), HttpStatus.OK);
    }
}
