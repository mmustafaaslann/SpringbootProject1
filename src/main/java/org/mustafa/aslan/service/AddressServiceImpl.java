package org.mustafa.aslan.service;

import org.mustafa.aslan.entity.Address;
import org.mustafa.aslan.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAll() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public Address get(Long id) {
            return addressRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }
}
