package org.mustafa.aslan.service;

import org.mustafa.aslan.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User get(Long userId);
    User save(User user);
    User update(User user);
    void delete(Long userId);
}
