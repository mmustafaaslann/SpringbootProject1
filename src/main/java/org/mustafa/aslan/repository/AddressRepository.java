package org.mustafa.aslan.repository;

import org.mustafa.aslan.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository <Address, Long>{
}
