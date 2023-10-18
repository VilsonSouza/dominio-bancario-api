package me.projects.services;

import me.projects.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
