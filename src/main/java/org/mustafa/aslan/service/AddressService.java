package org.mustafa.aslan.service;

import org.mustafa.aslan.entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAll();
    Address get(Long addressId);
    Address save(Address address);
    Address update(Address address);
    void delete(Long addressId);
}
