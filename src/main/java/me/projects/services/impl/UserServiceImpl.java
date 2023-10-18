package me.projects.services.impl;

import me.projects.domain.Repository.UserRepository;
import me.projects.domain.model.User;
import me.projects.services.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return  userRepository.findById(id).orElseThrow(NoSuchElementException::new);

    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId()!=null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User ID Already Exists.");
        }return userRepository.save(userToCreate);
    }
}
