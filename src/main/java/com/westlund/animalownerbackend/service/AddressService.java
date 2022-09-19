package com.westlund.animalownerbackend.service;

import com.westlund.animalownerbackend.exception.ResourceNotFoundException;
import com.westlund.animalownerbackend.model.Address;
import com.westlund.animalownerbackend.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements AddressServiceInterface{

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address findAddressById(long id) {
        return addressRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Address", "Id", id));
    }

    @Override
    public Address updateAddress(Address _address, long id) {
        Address address = addressRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Address", "Id", id));
        if (_address.getStreet() != null)
            address.setStreet(_address.getStreet());
        if (_address.getStreetNum() > 0)
            address.setStreetNum(_address.getStreetNum());
        if (_address.getPostalCode() > 0)
            address.setPostalCode(_address.getPostalCode());
        if (_address.getCity() != null)
            address.setCity(_address.getCity());

        return addressRepository.save(address);
    }

    @Override
    public String deleteAddressById(long id) {
        addressRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Address", "Id", id));
        addressRepository.deleteById(id);

        return "Deleted address with id: " + id;
    }
}
