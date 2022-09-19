package com.westlund.animalownerbackend.service;

import com.westlund.animalownerbackend.exception.ResourceNotFoundException;
import com.westlund.animalownerbackend.model.Owner;
import com.westlund.animalownerbackend.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements OwnerServiceInterface{

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner findOwnerById(long id) {
        return ownerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Owner", "Id", id));
    }

    @Override
    public Owner updateOwner(Owner _owner, long id) {
        Owner owner = ownerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Owner", "Id", id));
        if (_owner.getFirstname() != null)
            owner.setFirstname(_owner.getFirstname());
        if (_owner.getLastname() != null)
            owner.setLastname(_owner.getLastname());
        if (_owner.getAge() > 0)
            owner.setAge(_owner.getAge());
        return ownerRepository.save(owner);
    }

    @Override
    public String deleteOwnerById(long id) {
        ownerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Owner", "Id", id));
        ownerRepository.deleteById(id);
        return "Deleted owner with id: " + id;
    }
}
