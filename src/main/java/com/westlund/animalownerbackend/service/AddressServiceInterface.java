package com.westlund.animalownerbackend.service;

import com.westlund.animalownerbackend.model.Address;

import java.util.List;

public interface AddressServiceInterface {
    List<Address> getAllAddresses();
    Address saveAddress(Address address);
    Address findAddressById(long id);
    Address updateAddress(Address _address, long id);
    String deleteAddressById(long id);

}
