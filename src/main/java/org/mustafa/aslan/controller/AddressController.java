package org.mustafa.aslan.controller;

import org.mustafa.aslan.entity.Address;
import org.mustafa.aslan.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address/")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/")
    public List<Address> getAllAddress() {
        return addressService.getAll();
    }

    @GetMapping("/{addressId}")
    public Address getAddress(@PathVariable(name = "addressId") Long id) {
        return addressService.get(id);
    }

    @PostMapping("/")
    public Address saveAddress(@RequestBody Address address) {
        return addressService.save(address);
    }

    @PutMapping("/")
    public Address updateAddress(@RequestBody Address address) {
        return addressService.update(address);
    }

    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable(name = "addressId") Long id) {
        addressService.delete(id);
    }
}
