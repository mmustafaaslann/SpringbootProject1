package org.mustafa.aslan.repository;

import org.mustafa.aslan.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long>{
}
