package com.westlund.animalownerbackend.service;

import com.westlund.animalownerbackend.model.Owner;

import java.util.List;

public interface OwnerServiceInterface {
    List<Owner> getAllOwners();
    Owner saveOwner(Owner owner);
    Owner findOwnerById(long id);
    Owner updateOwner(Owner _owner, long id);
    String deleteOwnerById(long id);
}
